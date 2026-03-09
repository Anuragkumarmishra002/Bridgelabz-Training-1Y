package methodsLevel2;
import java.util.Scanner;
public class YoungestAndTallest {
    public static int findYoungest(int[] age){
        int minIndex = 0;
        for(int i = 1; i < age.length; i++){
            if(age[i] < age[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int tallest(int[] height){
        int maxIndex = 0;
        for(int i = 1; i < height.length; i++){
            if(height[i] > height[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.println("Enter the age of " + names[i]);
            age[i] = sc.nextInt();
            System.out.println("Enter the height of " + names[i]);
            height[i] = sc.nextInt();
            System.out.println();
        }
        int ageResult = findYoungest(age);
        int heightResult = tallest(height);
        System.out.println("Youngest friend is " + names[ageResult]);
        System.out.println("Tallest friend is " + names[heightResult]);
    }
}