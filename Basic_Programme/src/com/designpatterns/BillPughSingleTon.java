package com.designpatterns;
//because of java 5 changes there are changes in singleton classs to avoid this he came with static inner class to imrove perfoarmanec
public class BillPughSingleTon {

	private static BillPughSingleTon obj;

	private BillPughSingleTon() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static class SingleTonHelper
	{
		private static BillPughSingleTon b=new BillPughSingleTon();
	}
	public static BillPughSingleTon billPughSingleTon()
	{
		return SingleTonHelper.b;
	}
	
	
	
}
