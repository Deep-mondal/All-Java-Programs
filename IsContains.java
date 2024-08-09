class IsContains {
	public static void main(String[] args) {
		String s1 = "This is the sentence";
		String s2 = "is";
		int s1Length = s1.length();
        int s2Length = s2.length();

        for (int i = 0; i <= s1Length - s2Length; i++) {
            int j = 0;
            for (j = 0; j < s2Length; j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
            }
            if (j == s2Length) {
                System.out.print(i);
            }
        }
	}
}