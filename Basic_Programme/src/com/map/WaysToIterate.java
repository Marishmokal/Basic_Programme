package com.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class WaysToIterate {
public static void main(String[] args) {
	
	HashMap<String,Integer> m=new HashMap();
	m.put("Marish", 101);
	m.put("Nishant", 112);
	m.put("Bharat", 152);
	
	System.out.println(m);
	
	Collection<Integer>c=m.values();
	Iterator<Integer>itrr=c.iterator();
	while(itrr.hasNext())
	{
		System.out.println(itrr.next());
	}
	
//	Set<Entry<String,Integer>>s=m.entrySet();
//	Iterator<Entry<String,Integer>>itr=s.iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());//entrySet
//	}
	
	
	Set<String>s1=m.keySet();
	Iterator<String>itr=s1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());//keyset
	}
	
	
	
	
	//Sort By value
	
//	Set<Entry<String,Integer>>s1=m.entrySet();
//	ArrayList<Entry<String,Integer>>a1=new ArrayList(s1);
//	
//	Collections.sort(a1,new SortByValue());
//	for(Entry<String,Integer>a2:a1)
//	{
//		System.out.println(a2);
//	}
//		
		

		
	}

	
	
}

