package test.driven;

public class SwapUsing3 {
public static void main(String[] args) {
	int x=5;
	int y=6;
	
	System.out.println("before swap"+x);
	System.out.println("before swap"+y);
	
	int temp=x;
	x=y;
	y=temp;
	
	
	System.out.println("after swap"+x);
	System.out.println("after swap"+y);
}
}
