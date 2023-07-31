package com.prowings.array;

import java.util.Arrays;

public class InsertElement {
public static void main(String[] args) {
	int[]x= {12,45,36,32,12};
	
	int index=2;
	int value=5;
	System.out.println(Arrays.toString(x));
	for(int i=x.length-1;i>index;i--)
	{
		x[i]=x[i-1];
	}
	x[index]=value;
	System.out.println(Arrays.toString(x));
}
}
