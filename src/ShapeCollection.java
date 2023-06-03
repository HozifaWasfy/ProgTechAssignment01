package Assi01;
import java.util.ArrayList;
public class ShapeCollection {
    private final ArrayList<Shape> shapes;
    public ShapeCollection(ArrayList<Shape> shapes) {
        this.shapes = new ArrayList<Shape>(shapes);
    }
    public String getMaxShape(){
        Shape max = shapes.get(0);
        for(Shape s : this.shapes){
            if (s.getArea()>max.getArea()){
                max = s;
            }
        }
        return max.toStr();
    } 
}
