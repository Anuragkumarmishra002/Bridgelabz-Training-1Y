import java.util.Scanner;
class GreatestFactor{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num=sc.nextInt();
        int factor=1;
        for(int i=num-1;i>=1;i--){
            if(num%i==0){
                factor=i;
                break;
            }
        }
        System.out.println("Greatest factor of "+num+" besides itself is: "+factor);
    }
}
