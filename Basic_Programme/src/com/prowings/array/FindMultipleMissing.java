package com.prowings.array;

import java.util.Arrays;

public class FindMultipleMissing {
public static void main(String[] args) {
	
	Integer[]x= {5,1,3,6,7,9,10};
	
	Arrays.sort(x);
	int max=x[x.length-1];
	int j=0;
	for(int i=1;i<=max;i++)
	{
		if(j<=x.length && i==x[j])
		{
			j++;
		}
		else
			System.out.print(i+" ");
	}
}
}
