package pro.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronisedList {
public static void main(String[] args) {
	ArrayList<Integer>a=new ArrayList<>();
	a.add(10);
	a.add(15);
	a.add(9);
	a.add(5);
	System.out.println(a);
	
	List l1=Collections.synchronizedList(a);
	System.out.println(l1);
}
}
