package test.driven;

public class ArmNumber {
public static void main(String[] args) {
	int r,c,arm=0;
	int num=153;
	c=num;
	while(num>0)
	{
		r=num%10;
		arm=arm+(r*r*r);
		num=num/10;
	}
	if(c==arm)
	{
		System.out.println("armstrong number");
	}
	else
		System.out.println("not armstrong number");
}
}
