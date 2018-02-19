<%@page import="java.security.acl.LastOwnerException"%>
<%@page import="javax.jws.Oneway"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.*,javax.xml.parsers.*,javax.xml.xpath.*,java.io.File,org.w3c.dom.*,com.xmlRead.XMLReader"%>
<%
	String nodeName = "";//actual node location(PAth)
	String displayNodeName="";//node name
	NodeList nodeList = null;
	XPath xPath = XPathFactory.newInstance().newXPath();
	List<String> list2 = new ArrayList<String>();
	Map<String, Integer> repetitions = new LinkedHashMap<String, Integer>();
	String count = "";
	Node forFindType=null;
%>
<%
	if (nodeName.equals("")) {
		nodeName = request.getParameter("aa");
		
		out.println(nodeName);
		
		displayNodeName = nodeName.substring(nodeName.lastIndexOf("/")+1);
		displayNodeName=displayNodeName.substring(0, displayNodeName.indexOf("["));

		forFindType = (Node) xPath.compile(nodeName).evaluate(XMLReader.doc, XPathConstants.NODE);
		
		String expression = nodeName + "/child::*";

		//Add child node into list2
		nodeList = (NodeList) xPath.compile(expression).evaluate(
				XMLReader.doc, XPathConstants.NODESET);
		if (nodeList.getLength() != 0) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				list2.add(nodeList.item(i).getNodeName());
			}
		}

		//Count repetitions of node
		for (int i = 0; i < list2.size(); ++i) {
			String item = list2.get(i);
			if (repetitions.containsKey(item)) {
				repetitions.put(item, repetitions.get(item) + 1);
			} else {
				repetitions.put(item, 1);
			}
		}

	}
%>
<form action="">
	<table border=1>
		<tr>
			<%
				if (nodeList.getLength() != 0 || forFindType.getTextContent().equals("") ) {		
			%>
			<td align="center">Child Tags of : <br><%=displayNodeName%></td>
			<td>
				<%
				//prints attributes if available
					if (XMLReader.checkAttr(nodeName)) {
							for (String key : XMLReader.attrList) {
				%> <%=key%><br> <%
 	}

 		}
 %> <select onchange="selectOpt(1102)" id="selectOpt1102">
					<option>-SELECT-</option>
					<%
						for (String it : repetitions.keySet()) {
								int n = repetitions.get(it).intValue();
								for (int a = 1; a <= n; a++) {
					%>
					<option value="<%=nodeName + '/'%><%=it + '[' + a + ']'%>"><%=it%></option>
					<%
								}
							}
					%>
			</select><br>
			</td>
			<%
				} else {
			%>
			<td align="center">Node : <%=displayNodeName%> 
			</td>
			<td>
				<%
				//prints attributes if available
					if (XMLReader.checkAttr(nodeName)) {
							for (String key : XMLReader.attrList) {
				%> <%=key%><br> <%
 	}

 		}
 %> <%
 //prints value of node
 	nodeList = (NodeList) xPath.compile(nodeName).evaluate(
 				XMLReader.doc, XPathConstants.NODESET);
 		String val2 = nodeList.item(0).getChildNodes().item(0)
 				.getTextContent();
 %>Value : <%=val2%>
			</td>
			<%
				}
			%>
		</tr>
		<%
		//checks if not root
			if (!nodeName.equals(XMLReader.rootEle + "[1]")) {
		%>
		<tr>
			<td colspan="2"><a href="addNode.jsp?node=<%=nodeName%>">
					Add a node before/child of < <%=displayNodeName%> > node
			</a><br> <a href="removeNode.jsp?node=<%=nodeName%>"> Delete < <%=displayNodeName%>
					> node
			</a> <br></td>
		</tr>
		<%
			}
		%>
	</table>
</form>
<br>
