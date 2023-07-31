package com.prowings.array;

public class FindDuplicate {
public static void main(String[] args) {
	int[]x= {2,5,4,2,4,6,7,9,7};
	
	for(int i=0;i<x.length-1;i++)
	{
		for(int j=i+1;j<x.length;j++)
		{
			if((x[i]==x[j]) && (i!=j))
			{
				System.out.println(x[j]);
			}
		}
	}
}
}
