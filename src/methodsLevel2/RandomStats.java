package methodsLevel2;
public class RandomStats {
    public int[] generate4DigitsandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];
            min = Math.min(min,numbers[i]);
            max = Math.max(max,numbers[i]);
        }
        double average = sum /numbers.length;
        double[] result = new double [3];
        result[0] =  average;
        result[1] =min;
        result[2] = max;
        return  result;
    }
    public static void main (String[] args) {
        RandomStats obj = new RandomStats();
        int[] randomNumbers =  obj.generate4DigitsandomArray(5);
        System.out.println("Generated 4 Digit Random Numbers ");
        for(int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }
        double[] result = obj.findAverageMinMax(randomNumbers);
        System.out.println("\nAverage " + result[0]);
        System.out.println("Minimum " + result[1]);
        System.out.println("Maximum " + result[2]);
    }
}