package Assi01;
//import java.lang.Math.*;
public class Circle extends Shape {
    public Circle(int x,int y, int radius){
        super(x, y, radius);
    }
    @Override 
    double getArea(){
        return this.getRadius() * 2 * Math.PI ;
    }
}
