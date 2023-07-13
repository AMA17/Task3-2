public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int calculation;
        int weightInKg = 80; // вес
        double heightInMeter = 1.78; // рост
        int bmi = service.calculate(weightInKg,heightInMeter);
        System.out.println(bmi);
    }
}