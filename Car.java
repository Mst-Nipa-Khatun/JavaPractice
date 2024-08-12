
package SuperKeyword;


public class Car extends Vichele {
        int gear;
   Car(String c, double w, int g){
    super(c,w);
    gear=g;
   }
   void attribute()
    {
        System.out.println("Color:"+colour);
        System.out.println("weight:"+weight);
        System.out.println("Gear:"+gear);
    }
    
}
