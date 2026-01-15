
public class UniversityFees {
public static void main(String[] args){
double  fees = 125000 ;
double discountPercentage = 10 ;
double discount = fees *( discountPercentage / 100 );
double  amount = fees - discount ;
System.out.printf(" The Fees After Discount is %.2f ",amount );
}
}
