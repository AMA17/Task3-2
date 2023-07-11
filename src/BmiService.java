public class BmiService {
    public int calculate(int weightInKg, double heightInMeter) {
        double bmi = weightInKg / (heightInMeter * heightInMeter);
        return (int) bmi;
    }
}
