package com.xmlRead;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.*;
import org.w3c.dom.*;

public class XMLReader {

	public static int depthOfXML = 1;
	public static ArrayList<String> list = null;
	public static ArrayList<String> attrList = null;
	public static Document doc;
	public static String xmlFile;
	public static boolean isEmpty=false;
	public static String rootEle="";
	public static XPath xPath = XPathFactory.newInstance().newXPath();
	

	public  XMLReader() {
			
		try {
			list=new ArrayList<String>();
			
			xmlFile = "C:\\Users\\51542294\\Documents\\emp2.xml";

			File file = new File(xmlFile);
			if (file.exists()) {
				// Create a factory
				DocumentBuilderFactory factory = DocumentBuilderFactory
						.newInstance();
				// Use the factory to create a builder
				DocumentBuilder builder = factory.newDocumentBuilder();
				doc = builder.parse(xmlFile);
				doc.getDocumentElement().normalize();
				Element elements = doc.getDocumentElement();

				rootEle=elements.getNodeName();
				//Add Root Element
				list.add(rootEle);

			} else {
				System.out.print("File not found!");
			}
		} catch (Exception e) {
			isEmpty=true;
			System.out.println(e);
			//System.exit(1);
		}
	}


	public static void add(String node, String name, String value,String add_type)
			throws TransformerException, XPathExpressionException {

		NodeList nodes = (NodeList) xPath.compile("//"+node).evaluate(doc,
				XPathConstants.NODESET);

		Element p = doc.createElement(name);
		Text a = doc.createTextNode(value);
		p.appendChild(a);
		if(add_type.equals("before")){
			nodes.item(0).getParentNode().insertBefore(p, nodes.item(0));
		}else{       
			nodes.item(0).appendChild(p);
		}

		// write the content into xml file
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(xmlFile));
		t.transform(source, result);

	}

	public static void remove(String name) throws XPathExpressionException,
			TransformerException {

		Node b13Node = (Node) xPath.compile("//"+name).evaluate(doc,
				XPathConstants.NODE);
		b13Node.getParentNode().removeChild(b13Node);

		// write the content into xml file
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		t.transform(new DOMSource(doc), new StreamResult(new File(xmlFile)));
	}
	

	public static boolean checkAttr(String node)
			throws XPathExpressionException {
		boolean flag = false;
		attrList = new ArrayList<String>();
		
		String expression = "//" + node + "/attribute::*";
		
		NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc,
				XPathConstants.NODESET);
		for (int i = 0; i < nodeList.getLength(); i++) {
			flag = true;
			attrList.add("Attribute Name : "+nodeList.item(i).getNodeName() + ",  Attribute Value : "
					+ nodeList.item(i).getFirstChild().getNodeValue());
			// System.out.println(nodeList.item(i).getNodeName()+"  "+nodeList.item(i).getFirstChild().getNodeValue());
		}
		return flag;
	}

}
