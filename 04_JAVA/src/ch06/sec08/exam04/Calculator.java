package ch06.sec08.exam04;

public class Calculator {

    public double areaRectangle(double edge){
        return edge * edge;
    }

    public double areaRectangle(double width, double height){
        return width * height;
    }

     public void print(Double result) {
         System.out.println("area :" + result);
     }

}
