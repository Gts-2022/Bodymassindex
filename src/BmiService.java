public class BmiService {
    public double calculate(double mass) {
        double height;
        height=1.5;
        return mass / (height * height);
    }
}
