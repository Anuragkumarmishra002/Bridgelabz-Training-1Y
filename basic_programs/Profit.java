
public class Profit {
public static void main(String[] args ) {
double costPrice = 129 ;
double sellingPrice = 191 ;
double profit = sellingPrice - costPrice ;
double profitPercentage = (profit / costPrice ) * 100.0;
System.out.printf("The Cost Price is INR %f and Selling Price is INR %f The Profit is INR %f and the Profit Percentage is %.2f" , costPrice  , sellingPrice , profit , profitPercentage );
}
}
