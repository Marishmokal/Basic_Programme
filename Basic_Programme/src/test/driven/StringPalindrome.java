package test.driven;

public class StringPalindrome {
public static void main(String[] args) {
	
	System.out.println(isPalindrome("level"));
}

private static boolean isPalindrome(String string) {
	return string.equals(new StringBuffer(string).reverse().toString());
	
	
}
}
