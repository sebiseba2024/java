package ro.ulbs.paradigme.lab2;

public class Triangle extends Form{
    public float width;
    public float height;
    public float getLength(){return this.width;}
    public float getRadius(){return this.height;}
    public void setWidth(float width){this.width = width;}
    public void setHeight(float height){this.height = height;}
    public Triangle(){}
    public Triangle(float width, float height , String color)
    {this.width = width; this.height = height;this.setColor(color);}
    public String toString(){ return "This triangle has the color"+this.getColor();}
    public boolean equals(Triangle triangle)
    {
        if(this.getColor()==triangle.getColor() && this.width==triangle.width && this.height==triangle.height)
            return true;
        else
            return false;
    }

}
