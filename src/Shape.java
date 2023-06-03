package Assi01;
abstract class Shape {
    private final int x;
    private final int y;
    private  int radius;

    public Shape(int x,int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int radius){
         this.radius = radius;
    }
    abstract double getArea() ;
    abstract String toStr();
}
