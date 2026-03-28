package strings1;
import java.util.Scanner ;
public class LongestWord {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine() ;
        String result = "";
        String []words = str1.split(" ");
        String longest = "";
        for( int i = 0 ; i < words.length ; i ++){
            if( words[i].length() > longest.length() ) {
                longest = words[i];
            }
        }
        System.out.println("The longest word in string is "+longest);
    }
}
