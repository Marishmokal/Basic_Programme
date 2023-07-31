package test.driven;

public class strpalin {
public static void main(String[] args) {
	
	System.out.println(isPalindrome("level"));
}

private static boolean isPalindrome(String s) {
	return s.equals(new StringBuffer(s).reverse().toString()) ;
	
	
}
}
