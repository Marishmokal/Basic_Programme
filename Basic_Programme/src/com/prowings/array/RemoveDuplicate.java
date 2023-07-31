package com.prowings.array;

public class RemoveDuplicate {
public static void main(String[] args) {
	
	Integer[]x= {15,5,45,32,42,5,18,72,32};
	
	for(int i=0;i<x.length-1;i++)
	{
		for(int j=i+1;j<x.length;j++)
		{
			if((x[i].equals(x[j])))
			{
				System.out.println(x[i]);
			}
		}
	}
}
}
