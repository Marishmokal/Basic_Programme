package com.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
public static void main(String[] args) {
	int count=0;
	
	Pattern p=Pattern.compile("a+");
	Matcher m=p.matcher("india is my country india is having 28 states");
	while(m.find())
	{
		++count;
		System.out.println(m.start()+" "+m.end()+" "+m.group());
	}
	System.out.println(count);
	
	
	
	String s="India is my country india is having 28 states";
	int c=0;
	String[]parts=s.split(" ");
	for(int i=0;i<parts.length;i++)
	{
		++c;
		System.out.println(parts[i]);
	}
	System.out.println(c);
}
}
