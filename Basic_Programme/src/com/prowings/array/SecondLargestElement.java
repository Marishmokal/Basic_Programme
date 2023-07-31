package com.prowings.array;

import java.util.Arrays;

public class SecondLargestElement {
public static void main(String[] args) {
	
	Integer[]x= {72,32,48,4,19,98};
	Arrays.sort(x);
	
	//System.out.println(x[x.length-2]);
	for(int i=0;i<x.length;i++)
	{
		for(int j=i+1;j<x.length;j++)
		{
			int temp=x[i];
			x[i]=x[x.length-1];
			x[x.length-1]=temp;
		}
		
	}
	System.out.println(x[x.length-1]);
}
	
}
