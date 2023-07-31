package com.basic;

public class StringToArrray {
public static void main(String[] args) {
	
	String[]x= {"12","52","32"};
	int[]ar=new int[x.length];
	for(int i=0;i<x.length;i++)
	{
		int arr=Integer.parseInt(x[i]);
		System.out.println(arr);
	}
}
}
