package com.prowings.array;

import java.util.Arrays;

public class CopyAnArray {
public static void main(String[] args) {
	int[]x= {42,15,36,78};
	int[]j=new int[4];
	
	for(int i=0;i<x.length;i++)
	{
		j[i]=x[i];
	}
	System.out.println(Arrays.toString(j));
}
}
