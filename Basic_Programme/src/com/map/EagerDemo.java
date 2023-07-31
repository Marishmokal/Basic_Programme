package com.map;

public class EagerDemo {

	private static EagerDemo obj=new EagerDemo();

	private EagerDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static EagerDemo eagerDemo()
	{
		if(obj==null)
		{
			obj=new EagerDemo();
		}
		return obj;
	}
}
