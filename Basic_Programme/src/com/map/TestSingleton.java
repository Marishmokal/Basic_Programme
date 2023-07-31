package com.map;

public class TestSingleton {
public static void main(String[] args) {
	
	SingletonDemo s1=SingletonDemo.singletonDemo();
	SingletonDemo s2=SingletonDemo.singletonDemo();
	System.out.println(s1==s2);
	
	
	EagerDemo e=EagerDemo.eagerDemo();
	EagerDemo e1=EagerDemo.eagerDemo();
	System.out.println(e==e1);
	
	StaticBlockDemo b1=StaticBlockDemo.staticBlockDemo();
	StaticBlockDemo b2=StaticBlockDemo.staticBlockDemo();
	System.out.println(b1==b2);
	
	LazyDemo l=LazyDemo.lazyDemo();
	LazyDemo l1=LazyDemo.lazyDemo();
	System.out.println(l==l1);
	
	BillPughDemo c1=BillPughDemo.billPughDemo();
	BillPughDemo c2=BillPughDemo.billPughDemo();
	System.out.println(c1==c2);
	
	
	ThreadSafeDemo t=ThreadSafeDemo.threadSafeDemo();
	ThreadSafeDemo t1=ThreadSafeDemo.threadSafeDemo();
	System.out.println(t==t1);
	
}
}
