public class BmiService {
    public int calculate(double height, double weight) {
        int result;
        height = 1.64; // Рост
        weight = 50; // Вес
        double bmi = weight / (height * height); // Индекс массы тела
        result = (int) bmi;
        return result;
    }
}
