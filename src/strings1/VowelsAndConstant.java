package strings1;
import java.util.Scanner ;
public class VowelsAndConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        int vowel = 0 ;
        int consonant = 0 ;
        String str = sc.nextLine() ;
        str = str.toLowerCase();
        for( int i = 0 ; i < str.length(); i ++){
            char ch = str.charAt(i);
            if( ch >= 'a' && ch <= 'z'){
                if ( ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
                vowel++; }
                else {
                        consonant++ ;
                    }

            }
        }
        System.out.println("Vowel " +vowel);
        System.out.println("Consonant " +consonant);
    }
}