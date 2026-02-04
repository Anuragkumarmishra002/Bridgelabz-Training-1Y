
import java.util.Scanner;
class BmiArray {

public static void main(String args[]) {

Scanner input =new Scanner(System.in);

System.out.println("Enter number of persons");
int n= input.nextInt();

double weight[]= new double[n];
double height[]= new double[n];
double bmi[] = new double[n];
String status[] = new String[n];


for(int i=0;i<n;i++)
{
System.out.println("Enter weight of person "+(i+1));

weight[i]=input.nextDouble();
System.out.println("Enter height of person "+(i+1));
height[i] = input.nextDouble();
}

for(int i=0;i<n;i++)
{
bmi[i]=weight[i]/(height[i]*height[i]);

if(bmi[i] <18.5)
{
status[i]="IS Underweight";
}
else if(bmi[i] >= 18.5 && bmi[i]<25)
{
status[i]="IS Normal";
}
else if(bmi[i]>=25 && bmi[i]<30)
{
status[i]="IS Overweight";
}
else
{
status[i]="IS Obese";
}
}

System.out.println("Height  Weight  BMI  Status");
for(int i=0;i<n;i++)
{
System.out.println(height[i]+"  "+weight[i]+"  "+bmi[i]+"  "+status[i]);
}
input.close();
}
}
