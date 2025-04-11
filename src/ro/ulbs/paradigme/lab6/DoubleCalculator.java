package ro.ulbs.paradigme.lab6;

public class DoubleCalculator extends ACalculator{

    public DoubleCalculator(double a) {
        state = a;
    }
    public DoubleCalculator() {
        state = 0.0;
    }
        public DoubleCalculator add(double a){
            state = (double) state + a;
            return this;
        }
        public DoubleCalculator subtract(double a){
            state = (double) state - a;
            return this;
        }
        public DoubleCalculator multiply(double a){
            state = (double) state * a;
            return this;
        }
        public DoubleCalculator divide(double a){
            if(a == 0){
                throw new ArithmeticException("Division by zero");
            }
            else {
                state = (double) state / a;
                return this;
            }
        }
    public DoubleCalculator setState(double a){
        state = a;
        return this;
    }
    @Override
    public DoubleCalculator init() {
        state=0.0;
        return this;
    }
    @Override
    public DoubleCalculator clear() {
        state=0.0;
        return this;
    }
}
