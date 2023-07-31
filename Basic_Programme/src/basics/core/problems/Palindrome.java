package basics.core.problems;

public class Palindrome {
public static void main(String[] args) {
	int c,palindrome=0;
	int num=010;
	c=num;
	while(num>0)
	{
		palindrome=palindrome*10+num%10;
		num=num/10;
	}
	if(c==palindrome)
	{
		System.out.println("palindrome number");
	}
	else
	{
		System.out.println("not palindrome ");
	}
}
}
