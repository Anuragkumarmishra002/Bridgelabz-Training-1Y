package ScenerioBased;
import java.util.ArrayList;
public class SensorData {
    static ArrayList<Double> data = new ArrayList<>();
    public static void log(double value) {
        data.add(value);
    }
    public static void log(Double value) {
        data.add(value);
    }
    public static void printData() {
        for (Double d : data) {
            double temp = d;
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        log(35.5);
        log(Double.valueOf(33.2));
        log(20.7);
        printData();
    }
}
