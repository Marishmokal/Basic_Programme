package com.basic;

public class ImplicitAndExplicit {
public static void main(String[] args) {
	
	int i=20;
	long l=i;
	
	System.out.println(l);//implicit promotion
	
	
	long s=50000;
	int a=(int) s;
	System.out.println(a);//explicit promotion
	
}
}
