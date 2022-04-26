public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 95; // Масса в килограммах
        float height = 1.76F; // Рост в сантиметрах
        double bmIndex = Math.round(100.0 * service.calculate(mass, height)) / 100.0;
        System.out.println("Индекс массы тела: " + bmIndex);
    }
}
