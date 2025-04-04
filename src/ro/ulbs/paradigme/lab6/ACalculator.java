package ro.ulbs.paradigme.lab6;

public abstract class ACalculator {
    public Object state;
    public Object result() {
        return state;
    }
    public Object clear(){
        state = 0;
        return this;
    }
    public abstract Object init() ;


}
