package strings1;
import java.util.Scanner ;
public class SubString {
    public static  void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String input = sc.nextLine() ;
        System.out.println("Enter the substring you want to check ");
        String sub = sc.nextLine();
         int index = 0 ;
         int count = 0 ;
        while((index = input.indexOf(sub, index)) != -1) {
             count ++ ;
         index = index + sub.length();
        }
        System.out.println("Occurence of substring in main string is " + count);
    }
}
