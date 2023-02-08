public class BmiService {
    public double calculate(int mass) {
        double height=1.78;
        return mass / (height * height);
    }
}
