
package Abstraction;


public class ShapeTest {
    public static void main(String[] args) {
            ShapeAbstract Shape;
             Shape=new RectangleAbstarct(10,20);
             Shape.area();
             
             Shape= new TringleAbstact(10,20);
             Shape.area();
             
             Shape= new CircleAbstract(10);
             Shape.area();
    }
    
}
