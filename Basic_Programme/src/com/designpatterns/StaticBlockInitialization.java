package com.designpatterns;
//we can handle Exception
public class StaticBlockInitialization {

	private static StaticBlockInitialization obj;

	private StaticBlockInitialization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static StaticBlockInitialization staticBlockInitialization()
	{
		return obj;
	}
	static
	{
		obj=new StaticBlockInitialization();
	}
}
