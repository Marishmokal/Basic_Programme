package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Shree
 *MATHODS OF ENTRY INTERFACE
 */
public class MapMethods {
public static void main(String[] args) {
	
	HashMap map=new HashMap();
	
	map.put(101,"Marish");
	map.put(102,"Bharat");
	map.put(103,"Nishant");
	map.put(104,"Tejas");
	
	System.out.println(map);
	
	Iterator<Entry<Integer,String>>s=map.entrySet().iterator();
	while(s.hasNext())
	{
		Map.Entry<Integer,String>entry=s.next();
//		System.out.println("value is"+entry.getKey()+"Value is"+entry.getValue());
		
		
		Entry<Integer,String>e=s.next();
		entry.setValue("Manish");
		System.out.println(map);
		
	}
}
}
