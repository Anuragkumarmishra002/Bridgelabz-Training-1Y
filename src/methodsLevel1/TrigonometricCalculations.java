package methodsLevel1;
import java.util.Scanner ;
class TrigonometricCalculations {
    public static double[] trigonometricAngle(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angle in degrees ");
        double angle = sc.nextDouble();
        double[] result = trigonometricAngle(angle);
        System.out.println("Sine value " + result[0]);
        System.out.println("Cosine value " + result[1]);
        System.out.println("Tangent value " + result[2]);
    }
}