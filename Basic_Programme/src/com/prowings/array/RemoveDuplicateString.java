package com.prowings.array;

public class RemoveDuplicateString {
public static void main(String[] args) {
	
	String s="vaibhav";
	char[] ch=s.toCharArray();
	int size=ch.length;
	for(int i=0;i<size;i++) {
		
		for(int j=i+1;j<size;j++) {
			if(ch[i]==ch[j] ) {
				System.out.println(ch[i]);
				
			}
			
		}
	}
	
	
}
	
}
