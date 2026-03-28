package strings1;

import java.util.Scanner;

public class PalindromeString {

public static void main(String [] args ){
            Scanner sc =  new Scanner(System.in);
            System.out.println("Enter the string ");
            String str = sc.nextLine();
            String store = str;
            String reversed = "";
            for( int i = str.length() -1 ; i>=0 ; i--){
                reversed = reversed + str.charAt(i);
            }
            if(reversed.equals(store)){
            System.out.println("Pallindrome");
        }
            else{
                System.out.print("Not Pallindrome");
            }
    }



}
