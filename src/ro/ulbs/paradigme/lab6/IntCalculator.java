package ro.ulbs.paradigme.lab6;

public class IntCalculator {
    int state;
    public IntCalculator(int a) {
        this.state = a;
    }
    public IntCalculator add(int a) {
        this.state += a;
        return this;
    }
    public IntCalculator subtract(int a) {
        this.state -= a;
        return this;
    }
    public IntCalculator multiply(int a) {
        this.state *= a;
        return this;
    }
    public IntCalculator divide(int a) {
        if (a == 0) {
            throw new ArithmeticException("Division by zero");
        }
        this.state /= a;
        return this;
    }
    public int result() {
        return this.state;
    }
    public void clear() {
        this.state = 0;
    }
    public void setState(int a) {
        this.state = a;
    }

}
