package pro.string;

import java.util.Scanner;
import java.util.Stack;

public class ValidBracket {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("enter any bracket");
		String s=p.next();
	System.out.println(s+ " is "+(isValid(s)?"valid":"invalid"));

	}

	public static boolean isValid(String s) {
		char[] ch = s.toCharArray();
		Stack<Character> z = new Stack<>();
		
		for (Character eachEle : ch) {
			if (eachEle == '(' || eachEle == '{' || eachEle == '[') {
				z.push(eachEle);
			} else if (eachEle == ')' && !z.isEmpty() && z.peek() == '(') {
				z.pop();
			} else if (eachEle == '}' && !z.isEmpty() && z.peek() == '{') {
				z.pop();
			} else if (eachEle == ']' && !z.isEmpty() && z.peek() == '[') {
				z.pop();
			}
			else
			{
				return false;
			}		
		}
		return z.isEmpty();
	}
}
