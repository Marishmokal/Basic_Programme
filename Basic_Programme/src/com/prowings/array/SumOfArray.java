package com.prowings.array;

public class SumOfArray {
public static void main(String[] args) {
	int[]x= {5,2,4,6,8,3};
	int sum=0;
	for(int i=0;i<x.length;i++)
	{
		sum=sum+x[i];
	}
	System.out.println(sum);
}
}
