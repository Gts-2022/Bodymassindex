public class Main {
    public static void main(String[] args) {
        BmiService service=new BmiService();
        int weight=70;
        float index=(float) service.calculate(weight);
        System.out.println("Ваш индекс массы тела составляет: " + index);

    }
}