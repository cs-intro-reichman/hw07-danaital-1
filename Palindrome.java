/** Checks if a given string is a palindrome. */
public class Palindrome {
	public static void main(String[] args){
		System.out.print(isPalindrome (args[0],0));
	}
	public static boolean isPalindrome (String s){
		return isPalindrome (s,0);
	}
	
	private static boolean isPalindrome (String s, int i){
			if (i > s.length() / 2){
				return true;
			}
			return s.charAt(i) == s.charAt(s.length() - i - 1) && isPalindrome(s, i + 1);
	}
}