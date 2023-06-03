package Assi01;

public class Hexagone extends Shape {
    public Hexagone(int x, int y, int radius){
        super(x, y, radius);
    }
    @Override
    double getArea(){
        double bHeight = (2*Math.sqrt(3)) * this.getRadius();
        return (2*getRadius()*bHeight);
    }
    @Override
    String toStr() {
    return String.format("Shape of Hexagon with x: %d  y: %d  and side: %d",this.getX(),this.getY(),this.getRadius());
    }
}
