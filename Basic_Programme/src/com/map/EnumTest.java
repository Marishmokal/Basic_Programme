package com.map;
enum Collage
{
	STUDENT,TEACHER,PIUN,PRINCIPLE;
}
public class EnumTest {
public static void main(String[] args) {
	Collage c=Collage.PIUN;
	
	switch(c)
	{
	case STUDENT:
		System.out.println("student is coming for performance");
		break;
		
	case TEACHER:
		System.out.println("Teacher is coming for performance");
		break;
	case PIUN:
		System.out.println("piun is coming for performance");
		break;
		
	case PRINCIPLE:
		System.out.println("Princy is coming for performance");
		break;
	}
}
}
