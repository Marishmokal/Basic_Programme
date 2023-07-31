package com.designpatterns;
//we can handle exception and object creation overhead is there
public class EagerInitialization {
private static EagerInitialization obj=new EagerInitialization();

public EagerInitialization() {
	super();
	// TODO Auto-generated constructor stub
}

public static EagerInitialization eagerInitialization()
{
	if(obj==null)
	{
		return obj=new EagerInitialization();
	}
	return obj;
}
}
