public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mycalculate = service.calculate(1.64,50 );
        System.out.println(mycalculate);
    }
}