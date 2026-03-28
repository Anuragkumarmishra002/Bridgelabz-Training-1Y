package strings1;
import java.util.Scanner;
public class FrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String str1 = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }
        int max = 0;
        char result = '\0';
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }
        System.out.println("Most Frequent Character is  = " + result );
    }
}