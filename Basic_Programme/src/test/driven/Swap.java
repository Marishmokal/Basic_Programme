package test.driven;

public class Swap {
public static void main(String[] args) {
	
	int x=5;
	int y=6;
	
	System.out.println("before swap"+x);
	System.out.println("before swap"+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println("after swap"+x);
	System.out.println("after swap"+y);
	
}
}
