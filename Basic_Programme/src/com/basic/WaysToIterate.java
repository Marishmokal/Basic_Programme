package com.basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class WaysToIterate {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put(11, "marish");
	hm.put(5, "bharat");
	hm.put(55, "tejas");
	
	System.out.println(hm);
	
	
	
	//Set<Entry<Integer,String>>s1=hm.entrySet();
//	Iterator<Entry<Integer,String>>itr=s1.iterator();
//	while(itr.hasNext())
//	{
//		System.out.println(itr.next());
//	}
	
//	Set<Integer>s2=hm.keySet();
//	Iterator<Integer>itr1=s2.iterator();
//	while(itr1.hasNext())
//	{
//		System.out.println(itr1.next());
//	}
	
	
	Collection<String>s3=hm.values();
	Iterator<String>itr2=s3.iterator();
	while(itr2.hasNext())
	{
		System.out.println(itr2.next());
	}
}
}
