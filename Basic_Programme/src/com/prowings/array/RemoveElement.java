package com.prowings.array;

import java.util.Arrays;

public class RemoveElement {
	
	public static void main(String[] args) {
		int[]x= {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

System.out.println(Arrays.toString(x));
int removeIndex=2;
for(int i=removeIndex;i<x.length-1;i++)
{
	x[i]=x[i+1];
}
	System.out.println("After removing element"+Arrays.toString(x));
}
}