package com.prowings.array;

public class DuplicateFromString {
public static void main(String[] args) {
	
	String[]s= {"A","B","C","A"};
	
	for(int i=0;i<s.length-1;i++)
	{
		for(int j=i+1;j<s.length;j++)
		{
			if((s[i].equals(s[j]))&& i!=j)
			{
				System.out.println(s[j]);
			}
		}
		
	}
}
}
