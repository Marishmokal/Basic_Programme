package com.basic;

public class Input {
public static void main(String[] args) {
	char[] ch1={'a','b','c','d','e'};
			char ch2[]={'a','b','n','s','d','e','f','s','d','e','k','f','d','j','f','h','e','c'};
			
}
public boolean isContains1(char[]ch1,char[]ch2)
{
for(int i=0;i<ch1.length;i++)
{
	for(int j=0;j<ch2.length;j++)
	{
		if(ch1[i]==ch2[j])
		{
			return true;
		}
}
}
return false;
}}
