package basics.core.problems;

public class StringPalindrome {
public static void main(String[] args) {
	
	System.out.println(isPalindrome("level"));
}

private static boolean isPalindrome(String string) {
	// TODO Auto-generated method stub
	return string.equals(new StringBuffer(string).reverse().toString());
}

}
