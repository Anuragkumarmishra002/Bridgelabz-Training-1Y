package strings1;
import java.util.Scanner ;
public class Toggel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result = result + Character.toUpperCase(ch);
            } else {
                result = result + ch; // for symbols and numbers
            }
        }
        System.out.println(result);
    }
}