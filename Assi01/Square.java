package Assi01;
public class Square extends Shape {
    public Square(int x, int y, int radius){
        super(x, y, radius);
    }
    @Override
    double getArea(){
        return 4*Math.pow(this.getRadius(),2);
    }
}
