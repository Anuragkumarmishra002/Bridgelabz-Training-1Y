import java.util.* ;
// comment out the array null to check bound one ;
// if checking out the in initialized comment out the all operation of input and index
public class MultiCatchArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

       int [] arr = new int [3];

       System.out.println("Enter 3 elements of array");
       for( int i= 0 ; i < 3 ; i++){
           arr[i] = sc.nextInt() ;

       }
        System.out.println("Enter the index you want to access");
        int index = sc.nextInt();
   // int [] arr = null ;
        try{
            System.out.println("Value at index "+ index +" is "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e ) {
            System.out.println("Array out of bound  and invalid index is given");
        }
        catch(NullPointerException e ){
            System.out.println("Array is  initialized");
        }
    }
}
