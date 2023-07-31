package com.basic;

public class WordOccurance {
public static void main(String[] args) {
	int count,partsLength,k;
	String s="india is my country india is having 28 states";
	
	String []parts=s.split(" ");
	partsLength=parts.length;
	for(int i=0;i<parts.length;i++)
	{
		String word=parts[i];
		count=1;
		for(int j=(i+1);j<(partsLength-1);j++)
		{
			if(parts.equals(parts[j]))
			{
				count++;
				for(k=j;k<(partsLength-1);k++)
				{
					parts[k]=parts[k+1];
				}
				partsLength--;
				j--;
			}
		}
		System.out.println("\n\n\t"+parts+"<==>"+count);
	}
}
}
