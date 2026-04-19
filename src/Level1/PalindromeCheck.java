package Level1;
class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public void displayResult() {
        System.out.println("Text     : " + text);
        if (isPalindrome()) {
            System.out.println("Result   :  \"" + text + "\" is a Palindrome");
        } else {
            System.out.println("Result   :  \"" + text + "\" is not a Palindrome");
        }
    }
}

 class Palindrome {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("madam");
        PalindromeChecker p2 = new PalindromeChecker("hello");
        PalindromeChecker p3 = new PalindromeChecker("racecar");
        PalindromeChecker p4 = new PalindromeChecker("Never odd or even");

        System.out.println("=== Palindrome Check ===\n");
        p1.displayResult();
        System.out.println();
        p2.displayResult();
        System.out.println();
        p3.displayResult();
        System.out.println();
        p4.displayResult();
    }
}