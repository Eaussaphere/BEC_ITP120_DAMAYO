public class StaticMethods {
    public static double calculateAverage(double[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] values = { 12.5, 6.3, 8.1, 10.2, 4.9 };

        double average = MathUtils.calculateAverage(values);

        System.out.println("Average: " + average);
    }
}
