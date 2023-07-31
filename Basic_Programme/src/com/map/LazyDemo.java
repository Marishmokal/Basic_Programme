package com.map;

public class LazyDemo {
private static LazyDemo obj=null;

private LazyDemo() {
	super();
	// TODO Auto-generated constructor stub
}

public static LazyDemo lazyDemo()
{
	if(obj==null)
	{
		obj=new LazyDemo();
	}
	return obj;
}
}
