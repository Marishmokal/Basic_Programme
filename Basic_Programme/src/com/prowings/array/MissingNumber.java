package com.prowings.array;

public class MissingNumber {
public static void main(String[] args) {
	
	Integer[]x= {1,2,3,5};
	int total_num=5;
	int expected_num_sum=total_num*((total_num+1)/2);
	
	int result=0;
	for(int i:x)
	{
		result=result+i;
	}
	System.out.println(expected_num_sum-result);
	
}
}
