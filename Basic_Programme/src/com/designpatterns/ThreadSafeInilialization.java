package com.designpatterns;
//simple null checking mechanisam
public class ThreadSafeInilialization {

	private static ThreadSafeInilialization obj;

	private ThreadSafeInilialization() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	synchronized static ThreadSafeInilialization threadSafeInilialization()
	{
		if(obj==null)
		{
			return obj= new ThreadSafeInilialization();
		}
		return obj;
	}
}
