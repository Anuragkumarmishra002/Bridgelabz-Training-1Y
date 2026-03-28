package strings1;


import java.util.Scanner;
public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
            sc.close();
            return;
        }
        int[] freq = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }
        boolean isAnagram = true;
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}