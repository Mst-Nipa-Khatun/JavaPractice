
package Abstraction;


public class CircleAbstract extends ShapeAbstract{
    
    CircleAbstract(double r)
    {
        super(r,r);
    }
    @Override
    void area()
 {
     double result= 3.1416 * dim1;
     System.out.println("Circle:"+result);
 }
    
}
