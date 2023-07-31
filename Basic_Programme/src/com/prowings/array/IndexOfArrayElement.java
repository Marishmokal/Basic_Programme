package com.prowings.array;

import java.util.Arrays;

public class IndexOfArrayElement {
public static void main(String[] args) {
	
	Integer[]x= {5,15,22,36,45,87};
	
	Arrays.sort(x);
	System.out.println(Arrays.binarySearch(x,22));
}
}
