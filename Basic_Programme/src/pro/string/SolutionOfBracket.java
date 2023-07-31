package pro.string;

import java.util.Stack;

public class SolutionOfBracket {
public boolean isValid(String s)
{

	Stack<Character>ls=new Stack();
	for(char ch:s.toCharArray())
	{
		if(ch=='('||ch=='{'||ch=='[')
		{
			ls.push(ch);
		}
		else if(ch==')' && !ls.isEmpty() && ls.peek()=='(')
		{
			ls.pop();
		}
		else if(ch=='}' && !ls.isEmpty() && ls.peek()=='{')
		{
			ls.pop();
		}
		else if(ch==']' && !ls.isEmpty() && ls.peek()=='[')
		{
			ls.pop();
		}
		else
		{
			return false;
		}
		
	}
	return ls.isEmpty();
	
}
}
