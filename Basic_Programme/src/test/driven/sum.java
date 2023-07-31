package test.driven;

public class sum {
public static void main(String[] args) {
	int sum=0;
	int num=442;
	for(int i=0;num!=0;i++)
	{
		sum=sum+num%10;
		num=num/10;
	}
	System.out.println(sum);
}
}
