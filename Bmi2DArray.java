import java.util.Scanner;

class Bmi2DArray 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of people");
        int totalPeople= input.nextInt();
        double[][] healthData= new double[totalPeople][3];
        String[] bmiCategory= new String[totalPeople];
        for(int i=0;i<totalPeople;i++)
        {
            System.out.println("Enter weight of person "+(i+1));
            double weight=input.nextDouble();
            while(weight<=0)
            {
                System.out.println("Enter positive weight");
                weight=input.nextDouble();
            }
            healthData[i][0]= weight;

            System.out.println("Enter height of person "+(i+1));
            double height=input.nextDouble();
            while(height<=0)
            {
                System.out.println("Enter positive height");
                height=input.nextDouble();
            }
            healthData[i][1]=height;
        }
        for(int i=0;i<totalPeople;i++)
        {
            double bmiValue=healthData[i][0]/(healthData[i][1]*healthData[i][1]);
            healthData[i][2]=bmiValue;
            if(bmiValue<18.5)
                bmiCategory[i]=" Is Underweight";
            else if(bmiValue<25)
                bmiCategory[i]=" Is Normal";
            else if(bmiValue<30)
                bmiCategory[i]="Is Overweight";
            else
                bmiCategory[i]="Is Obese";
        }

        System.out.println("Height Weight BMI Status");
        for(int i=0;i<totalPeople;i++)
            System.out.println(healthData[i][1]+" "+healthData[i][0]+" "+healthData[i][2]+" "+bmiCategory[i]);
    }
}
