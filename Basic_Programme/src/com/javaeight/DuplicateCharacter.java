package com.javaeight;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
public static void main(String[] args) {
	
	String name="baacdeabbfgh";
	findDuplicatedCharacter(name);
}

public static void findDuplicatedCharacter(String name) {
	// TODO Auto-generated method stub
	Map<Character,Integer>freqMap=new HashMap();
	
	for (char ch :name.toCharArray()) {
		freqMap.put(ch,freqMap.getOrDefault(ch, 0)+1);	
	}
	int maxFrequency=0;
	char mostDuplicatedCharacter=0;
	
	
	for ( Map.Entry<Character,Integer>entry : freqMap.entrySet()) {
		if(entry.getValue()>maxFrequency)
		{
			maxFrequency=entry.getValue();
			mostDuplicatedCharacter=entry.getKey();
		}
	}
	System.out.println("dulicated character:"+mostDuplicatedCharacter);
	
	
	
	
}
}
