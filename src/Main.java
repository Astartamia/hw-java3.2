public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kg = 78;
        double m = 1.79;
        int bmi = service.calculate(m, kg);
        System.out.println(bmi);
    }
}