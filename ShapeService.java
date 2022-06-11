package HW8;

public class ShapeService {
    Shape shape;
    ShapeService(Shape shape){
        this.shape = shape;
    }
    public String name(){
        return " My Name is " + shape.getShapeName();
    }
}
