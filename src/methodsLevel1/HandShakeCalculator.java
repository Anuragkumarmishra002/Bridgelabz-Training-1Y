package methodsLevel1;
import java.util.Scanner ;
 class HandShakeCalculator {
  public int Handshakes(int noOfStudents)   {
      int totalHandshakes = noOfStudents * (noOfStudents - 1) / 2 ;
      return totalHandshakes ; }
     public static void main(String[] args){
      Scanner sc = new Scanner(System.in );
      System.out.println("Enter the no of students");
      int noOfStudents = sc.nextInt();
         HandShakeCalculator obj = new  HandShakeCalculator();
         int result = obj.Handshakes(noOfStudents);
         System.out.println("Maximum number of handshakes: " + result);
  }
}
