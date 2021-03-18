package hw_19032021;

public class Calculator {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Calculator() {
        this.x = 0;
        this.y = 0;
    }

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double Summa(double x, double y) {
        return x + y;

    }

    public double Subtraction(double x, double y) {
        return x - y;
    }

    public double Multiplication(double x, double y) {
        return x * y;
    }

    public double Division(double x, double y) {
        return (x / y);
    }
}
