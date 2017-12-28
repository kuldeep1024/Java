package com.map.sort;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<String ,String> treeMap= new TreeMap<String ,String>();

		treeMap.put("12", "12");
		treeMap.put("11", "11");
		treeMap.put("14", "14");
		treeMap.put("11", "15");
		treeMap.put("13", "13");
		
		for(Map.Entry<String , String> m:treeMap.entrySet()){
			System.out.println(m.getKey() + " "+m.getValue());
		}
	}

}
