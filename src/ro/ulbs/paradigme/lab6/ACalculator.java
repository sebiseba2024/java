package ro.ulbs.paradigme.lab6;

public abstract class ACalculator {
    public Object state;
    public Object result() {
        return state;
    }
    public abstract Object clear();
    public abstract Object init() ;


}
