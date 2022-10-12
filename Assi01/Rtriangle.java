package Assi01;
public class Rtriangle extends Shape {
    public Rtriangle(int x, int y, int radius){
        super(x, y, radius);
    }
    @Override
    double getArea(){
        double bHeight = (Math.sqrt(3)/2) * this.getRadius();
        return bHeight*getRadius(); 
    }
}
