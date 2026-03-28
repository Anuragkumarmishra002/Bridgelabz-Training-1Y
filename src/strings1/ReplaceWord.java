package strings1;


import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String sentence = sc.nextLine();

        System.out.println("Enter the old word:");
        String oldWord = sc.nextLine();

        System.out.println("Enter the new word:");
        String newWord = sc.nextLine();
        String newStr = sentence.replace(oldWord , newWord);
        System.out.println(newStr);
    }
}