import java.util.Scanner ;
public class VoteCheckArray {
    public static void main (String[] args ) {
   Scanner input = new Scanner(System.in);
   int [] age = new int [10] ;  
   for(int i = 0  ; i < age.length ; i++) {
    System.out.println("Enter the age of student " +(i+1));
    age[i] = input.nextInt(); }
    for (int i = 0 ; i < age.length ; i++){
        if(age[i]<0){
            System.out.println("Invalid choice ");
        }
        else if(age[i]>=18) {
            System.out.println("The age of student is " +age[i]+" and Can Vote ");

        }
        else {
            System.out.println("The age of student is " +age[i]+" and Cannot Vote "); }
    }
    input.close();
    }
}
