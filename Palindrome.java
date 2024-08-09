class Palindrome {
	public static boolean isPalindrome(String s) {
		if(s.length() <= 1) {
			return true;
		}
		int left = 0;
		int right = s.length() - 1;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			right--;
			left++;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("abccba"));
		System.out.println(isPalindrome("abcdeab"));
		System.out.println(isPalindrome("apple"));
	}
}