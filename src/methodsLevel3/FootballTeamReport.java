package methodsLevel3;
import java.util.Scanner ;
public class FootballTeamReport {
public static int [] generateHeight(int size){
    int [] height = new int[size];
    int minHeight = 150 ;
    int maxHeigth = 250 ;
    for( int i = 0 ; i < height.length ; i++){
        height[i] =(int) (Math.random()* (maxHeigth - minHeight +1 )) + minHeight;
    }
    return height ;
}
public static int findSum(int [] height){

    int sum = 0 ;
    for(int i = 0 ; i < height.length; i++){
        sum = sum + height[i];

    }
    return sum ;
}
public static double  findMean(int [] height  ){
    int sumNew = findSum(height);
    int noOfPlayers = height.length ;
    double mean =  sumNew / noOfPlayers ;
    return mean ;
}
public static int findSmallest(int [] height ){
    int shortest = height[0] ;
 for( int i =  1 ;  i < height.length;i++){
     if( height[i] < shortest){
         shortest = height[i];
     }

 }
 return shortest;
}
public static int findTallest( int [] height){
    int tallest = height[0];
    for( int i = 1 ; i < height.length ; i++){
        if( height[i] > tallest){
            tallest = height[i];
        }
    }
    return tallest ;
}
public static void main(String[] args){
    int size = 11 ;
    int []height  = generateHeight(size);
    for(int i= 0 ; i < height.length ; i ++){
        System.out.println( "The height of the player "+(i+1)+" is "+ height[i]);

    }
    int totalHeight = findSum(height);
    double meanHeight = findMean(height);
    int shortestHeight = findSmallest(height);
    int tallestHeight = findTallest(height);

    System.out.println("Total Height " + totalHeight);
    System.out.println("Mean Height " + meanHeight);
    System.out.println("Shortest Height " + shortestHeight);
    System.out.println("Tallest Height " + tallestHeight);
}
    }