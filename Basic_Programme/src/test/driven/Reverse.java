package test.driven;

public class Reverse {
public static void main(String[] args) {
	int reverse=0;
	int num=155;
	for(int i=0;num!=0;i++)
	{
		reverse=reverse*10+num%10;
		num=num/10;
	}
	System.out.println(reverse);
}
}
