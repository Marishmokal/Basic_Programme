package com.map;

public class BillPughDemo {
private static BillPughDemo obj=null;

private BillPughDemo() {
	super();
	// TODO Auto-generated constructor stub
}

public static class SingletonHelper
{
	private static final BillPughDemo b=new BillPughDemo();
}
public static BillPughDemo billPughDemo()
{
	return SingletonHelper.b;
}
}
