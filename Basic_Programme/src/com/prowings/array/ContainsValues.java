package com.prowings.array;

public class ContainsValues {
public static void main(String[] args) {
	int[]x= {10,56,72,65,30,63};
	
System.out.println(contains(x,63));	
}

public static boolean contains(int[]x,int item)
{
	for(int n:x) {
		if(item==n)
		{
			return true;
		}
	}
	return false;
}
}
