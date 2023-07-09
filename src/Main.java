public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int calculation;
        int weight = 98; // вес
        double height = 1.87; // рост
        int bmi = service.calculate(calculation);
        System.out.println(bmi);
    }
}