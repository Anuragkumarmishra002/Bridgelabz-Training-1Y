import java.util.Scanner;
class MultiplesBelow100{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100 ");
        int number = input.nextInt();

        if(number <= 0 || number >= 100){
            System.out.println("Invalid input Plaese Number must be grater tha 0 and less than 100");
            return;
        }

        System.out.println("Multiples of " + number + " below 100");
        for(int i = 1; i < 100; i++){
            if(i % number == 0){
                System.out.print(i + " ");
            }
        }
    }
}
