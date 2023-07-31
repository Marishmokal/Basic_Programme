package com.designpatterns;

public class TestSingletonPattern {
public static void main(String[] args) {
	
	LazyInitialization l1=LazyInitialization.lazyInitialization();
	LazyInitialization l2=LazyInitialization.lazyInitialization();
	
	System.out.println(l1==l2);
	
	EagerInitialization e1=EagerInitialization.eagerInitialization();
	EagerInitialization e2=EagerInitialization.eagerInitialization();
	System.out.println(e1==e2);
	
	StaticBlockInitialization s1=StaticBlockInitialization.staticBlockInitialization();
	StaticBlockInitialization s2=StaticBlockInitialization.staticBlockInitialization();
	System.out.println(s1==s2);
	
	ThreadSafeInilialization t1=ThreadSafeInilialization.threadSafeInilialization();
	ThreadSafeInilialization t2=ThreadSafeInilialization.threadSafeInilialization();
	System.out.println(t1==t2);
	
	BillPughSingleTon b1=BillPughSingleTon.billPughSingleTon();
	BillPughSingleTon b2=BillPughSingleTon.billPughSingleTon();
	System.out.println(b1==b2);
}
}
