package basics.core.problems;

public class Seprator {
public static void main(String[] args) {
	
	String name="ma12#3*";
	char []ch=name.toCharArray();
	String s1="";
	String s2="";
	String s3="";
	for(int i=0;i<ch.length;i++)
	{
	if(Character.isAlphabetic(ch[i]))
	{
		s1=s1+ch[i];
	}
	if(Character.isDigit(ch[i]))
	{
		s2=s2+ch[i];
	}
	else
		s3=s3+ch[i];
}
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
}
}