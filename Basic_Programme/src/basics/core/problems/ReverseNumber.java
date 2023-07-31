package basics.core.problems;

public class ReverseNumber {
public static void main(String[] args) {
	int num=456;
	int reverse=0;
	for(int i=0;num!=0;i++)
	{
		reverse=reverse*10+num%10;
		num=num/10;
		
	}
	System.out.println(reverse);
	
}
}
