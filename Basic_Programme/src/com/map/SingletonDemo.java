package com.map;

public class SingletonDemo {

	private static SingletonDemo obj=null;

	SingletonDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public static SingletonDemo singletonDemo()
	{
		if(obj==null)
		{
			obj= new SingletonDemo();
		}
			return obj;
	}
}
