public class Main {
    public static void main(String[] args) {
        BmiService service=new BmiService();
        int myWeight=90;
        double myHeight=1.78;
        float index=(float) service.calculate(myWeight, myHeight);
        System.out.println("Ваш индекс массы тела составляет: " + index);

    }
}