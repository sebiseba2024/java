package ro.ulbs.paradigme.lab6;

import java.sql.SQLOutput;

public class LocalMain {
    public static void main(String[] args) {
//        IntCalculator calculator = new IntCalculator(10);
//        int result = calculator.add(5).subtract(3).multiply(2).result();
//        System.out.println("a) " + result);
          NewIntCalculator calculator2 = new NewIntCalculator(10);
        int result2 = (int)calculator2.init().add(5).subtract(3).multiply(2).result();
        System.out.println("b) " + result2);
        DoubleCalculator calculator3 = new DoubleCalculator(10.0);
        double result3 = (double)calculator3.init().add(5.0).subtract(3.3).multiply(2.2).result();
        System.out.println("c) " + result3);
    }
}
