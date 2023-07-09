public class BmiService {
    public int calculate(int calculation) {

        int weight;
        double height;

        double x;
        x = weight / (height * height);

        return (int) x;

    }
}
