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
    @Override
    String toStr() {
    return String.format("Shape of Triangle with x: %d  y: %d  and side: %d",this.getX(),this.getY(),this.getRadius());
    }
}
