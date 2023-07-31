package com.map;

public class ThreadSafeDemo {
private static ThreadSafeDemo obj=null;

private ThreadSafeDemo() {
	super();
	// TODO Auto-generated constructor stub
}

synchronized static ThreadSafeDemo threadSafeDemo()
{
	if(obj==null)
	{
		obj=new ThreadSafeDemo();
	}
	return obj;
}
}
