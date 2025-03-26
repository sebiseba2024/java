package ro.ulbs.paradigme.lab2;

public class Form {
     private String color;
    public static int counter = 0;
     public int area;

    public Form()
    {
        this.color="white";
        counter++;
    }
    public Form(int area,  String color)
    {
        this.area=area;
        this.color=color;
        counter++;
    }

    public void getCounter(){
        System.out.println("Sunt "+counter+" forme"); }
    public int getArea() { return 0;}
    public void setArea(int area) { this.area=area;}
    public String getColor() {return this.color;}
    public void setColor(String color) {this.color=color;}
   @Override
    public String toString(){ return "This form has the color"+this.color;}

}
