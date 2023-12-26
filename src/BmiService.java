public class BmiService {
    public int calculate(double height, double weight) {
        double bmi = weight / (height * height); // Индекс массы тела
        int result;
        result = (int) bmi;
        return result;
    }
}
