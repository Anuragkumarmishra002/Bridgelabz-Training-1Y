package strings1;

import java.util.Scanner;
public class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 ");
        String str1 = sc.nextLine();
        System.out.println("Enter String 2 ");
        String str2 = sc.nextLine();
        int minLength;
        if (str1.length() < str2.length()) {
            minLength = str1.length();
        } else {
            minLength = str2.length();
        }
        int result = 0;
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }
        if (result == 0)
            result = str1.length() - str2.length();
        if (result < 0)
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        else if (result > 0)
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        else
            System.out.println("Both strings are equal ");
    }
}