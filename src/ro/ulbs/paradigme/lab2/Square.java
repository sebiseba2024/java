package ro.ulbs.paradigme.lab2;

public class Square extends Form {
    public float side;
    public void setSide(float side){this.side = side;}
    public float getSide(){return this.side;}
    public Square(float side, String color){
        this.side = side;
        this.setColor(color);
    }
    public Square(){}
    public String toString(){ return "This square has the color"+this.getColor();}

}
