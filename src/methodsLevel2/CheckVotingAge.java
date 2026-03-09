package methodsLevel2;
import java.util.Scanner ;
public class CheckVotingAge {
    public boolean voteCheck( int age ){
        if( age < 0){
            return false ;
        }
        if (age >=18) {
        return true ; }
        else {
            return false ;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CheckVotingAge obj = new CheckVotingAge();
        int [] students = new int[10];
        for( int i = 1 ; i <= students.length; i++){
            System.out.println("Enter the age of student "+(i)+ " ");
            students[i]= sc.nextInt();
            boolean result = obj.voteCheck(students[i]);
            if(result){
                System.out.println("Student id eligible to vote"); }
                else {
                    System.out.println("Student is not eligible to vote");
                }

        }

    }
}
