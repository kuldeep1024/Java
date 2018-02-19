package com.map.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("11", 1);
		map.put("12", 12);
		map.put("13", 13);
		map.put("14", 18);
		map.put("15", 19);
		map.put("16", 14);
		
		System.out.println("******");
		Integer s = map.put("16", 13);// return type of map.put = values type
		System.out.println(s);
		System.out.println("******");
		
		Map<String, String> map2 = new HashMap<String, String>();
		String ii = map2.put("", "");

		Map<String, Integer> s_msp = sortMapByValue(map);

		for (Map.Entry<String, Integer> mm : s_msp.entrySet()) {
			System.out.println(mm.getValue());
		}

		//Collections.syn
		//map.va
		
	}

	private static Map<String, Integer> sortMapByValue(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Map.Entry<String, Integer> m1, Map.Entry<String, Integer> m2) {
				return m1.getValue().compareTo(m2.getValue());
			}
		});
		
		//LinkedHashMap - keeps order
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}

}
