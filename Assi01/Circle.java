package Assi01;
//import java.lang.Math.*;
public class Circle extends Shape {
    public Circle(int x,int y, int radius){
        super(x, y, radius);
    }
    @Override 
    double getArea(){
        return Math.pow(this.getRadius() , 2) * 4 ;
    }
    @Override
    String toStr() {
    return String.format("Shape of circle with x: %d  y: %d  and radius: %d",this.getX(),this.getY(),this.getRadius());
    }
}
