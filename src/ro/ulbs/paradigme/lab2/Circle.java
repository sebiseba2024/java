package ro.ulbs.paradigme.lab2;

public class Circle extends Form{
    public float radius;
   public float getRadius(){
        return radius;
    }
   public void setRadius(float radius){
        this.radius = radius;
    }
    public Circle(float radius, String color){this.radius = radius; this.setColor(color);    }
    public Circle(){}
    public String toString(){ return "This circle has the color"+this.getColor();}


}
