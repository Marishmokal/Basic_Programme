package com.prowings.array;

import java.util.Arrays;

public class ReverseArray {
public static void main(String[] args) {
	int[]x= {45,12,47,88,55,72,4};
	
	
	for(int i=0;i<x.length/2;i++)
	{
		int temp=x[i];
		x[i]=x[x.length-i-1];
		x[x.length-i-1]=temp;
	}
	System.out.println(Arrays.toString(x));
}
}
