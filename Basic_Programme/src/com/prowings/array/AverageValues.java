package com.prowings.array;

public class AverageValues {
public static void main(String[] args) {
	
	int[]x= {10,65,6,5,3};
	int sum=0;
	for(int i=0;i<x.length;i++)
	{
		sum=sum+x[i];
	}
	System.out.println(sum);
	
	double avg=sum/x.length;
	System.out.println(avg);
}
}
