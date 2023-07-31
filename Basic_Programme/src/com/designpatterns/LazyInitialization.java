package com.designpatterns;
// We can handle exception but we can only use in single threaded environment 
//performance is low
public class LazyInitialization {

	private static LazyInitialization obj;

	private LazyInitialization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static LazyInitialization lazyInitialization()
	{
		if(obj==null)
		{
		return obj=new LazyInitialization();
		}
		return obj;
	}
}
