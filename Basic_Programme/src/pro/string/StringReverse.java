package pro.string;

public class StringReverse {
public static void main(String[] args) {
	
	StringBuffer sb=new StringBuffer("Vinayak");
	System.out.println(sb.reverse());
	
	
	StringBuffer s=new StringBuffer("Rudra");
	String s1=s.reverse().toString();
	System.out.println(s1);
	
	String f="Communication";
	char[]ch=f.toCharArray();
	for(int i=ch.length-1;i>=0;i--)
	{
		System.out.print(ch[i]);
	}
}
}
