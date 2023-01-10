public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 69;
        double hight = 1.75;
        double bmi = service.calculate(weight, hight);
        System.out.println(bmi);
    }
}