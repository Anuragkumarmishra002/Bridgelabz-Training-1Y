package methodsLevel2;
import java.util.Scanner ;
public class BmiCalculator {
    public static void bmiCalculate(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInM = heightInCm / 100;
            double bmi = weight / (heightInM * heightInM);
            data[i][2] = bmi;
        }

    }

    public static String[] getStatusBmi(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = " Underweigth ";
            } else if (bmi >= 18.5 && bmi < 25) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

    double[][] personData = new double[10][3];

    for (int i = 0; i < personData.length; i++) {
        System.out.println("Enter details for Person " + (i + 1));
        System.out.print("Enter Weight (kg) ");
        personData[i][0] = sc.nextDouble();
        System.out.print("Enter Height (cm) ");
        personData[i][1] = sc.nextDouble();
    }
    bmiCalculate(personData);
    String[] status = getStatusBmi(personData);
    for (int i = 0; i < personData.length; i++) {

        System.out.println("Person " + (i + 1));
        System.out.println("Weight " + personData[i][0] + " kg");
        System.out.println("Height " + personData[i][1] + " cm");
        System.out.println("BMI " + personData[i][2]);
        System.out.println("Status " + status[i]);
        System.out.println();
    }

    sc.close();
}}