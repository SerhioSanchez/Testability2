public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        double bmi = service.calculate(83, 182);
        System.out.println("Индекс массы тела = " + bmi + " кг/м2");
    }
}