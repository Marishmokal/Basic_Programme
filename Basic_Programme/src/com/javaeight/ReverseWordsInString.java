package com.javaeight;

public class ReverseWordsInString {
public static void main(String[] args) {
	String input="Good Morning World";
	String output=reverseWordsInString(input);
	System.out.println(output);
}

public static String reverseWordsInString(String input) {
	String[]words=input.split("\\s+");
	
	StringBuilder reverseString=new StringBuilder();
	
	for(int i=words.length-1;i>=0;i--)
	{
		 reverseString.append(reverseWord(words[i])).append(" ");
	}
	
	return reverseString.toString().trim();
}

private static String reverseWord(String word) {
	
	return new StringBuilder(word).reverse().toString();
}
}
