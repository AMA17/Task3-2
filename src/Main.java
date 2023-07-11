public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int calculation;
        int weightInKg = 98; // вес
        double heightInMeter = 1.87; // рост
        int bmi = service.calculate(calculation);
        System.out.println(bmi);
    }
}