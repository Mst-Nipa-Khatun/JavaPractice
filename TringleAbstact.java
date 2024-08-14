
package Abstraction;


public class TringleAbstact extends ShapeAbstract {
    TringleAbstact(double dim1,double dim2)
    {
        super(dim1,dim2);
    }
 @Override
 void area()
 {
     double result= 0.5* dim1*dim2;
     System.out.println("Tringle:"+result);
 }
}
