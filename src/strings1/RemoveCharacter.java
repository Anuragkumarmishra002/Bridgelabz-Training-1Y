package strings1;

import java.util.Scanner;
public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string");
        String str1 = sc.nextLine();
        System.out.println("Enter the character want to remove ");
        char remove = sc.next().charAt(0);
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != remove)
                result = result +  ch;
        }
        System.out.println("Modified String  is " + result );
    }
}