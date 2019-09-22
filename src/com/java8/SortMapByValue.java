package com.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByValue {

    public static void main(String[] args) {

        Map<String, Integer> unsortMap = new HashMap<String, Integer>();
        unsortMap.put("w", 6);
        unsortMap.put("Q", 2);
        

        System.out.println("Unsort Map......");
        printMap(unsortMap);

        System.out.println("\nSorted Map......By Key");
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(
                new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        //return o2.compareTo(o1);
                    	return o1.compareTo(o2);
                    }

                });

	    /* For Java 8, try this lambda
		
		Map<Integer, String> treeMap = new TreeMap<>(
		                (Comparator<Integer>) (o1, o2) -> o2.compareTo(o1)
		        );
		*/
        treeMap.putAll(unsortMap);

        printMap(treeMap);

    }

    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() 
				+ " Value : " + entry.getValue());
        }
    }

}
