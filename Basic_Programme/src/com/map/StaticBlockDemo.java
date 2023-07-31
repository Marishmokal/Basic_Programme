package com.map;

public class StaticBlockDemo {

	private static StaticBlockDemo obj=null;

	private StaticBlockDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static StaticBlockDemo staticBlockDemo()
	{
		return obj;
	}
	static {
		
			obj=new StaticBlockDemo();
	}
}
