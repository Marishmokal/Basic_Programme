package com.prowings.array;

import java.util.Arrays;

public class SecondSmallestElement {
public static void main(String[] args) {
	
	Integer[]x= {12,54,63,87,13,96};
	
	Arrays.sort(x);
     for(int i=0;i<x.length/2;i++)
     {
    	 {
    		 int temp=x[i];
    		 x[i]=x[x.length-i-1];
    		 x[x.length-i-1]=temp;
    	 }
}
     System.out.println(Arrays.toString(x));
     System.out.println(x[x.length-2]);
     }
}