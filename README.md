# TriangleDemo

import java.util.Scanner;


public class DataType {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
        Double base, height, area;
        
         System.out.println("Enter base: ");
         base= input.nextDouble();
         System.out.println("Enter lenght: ");
         height= input.nextDouble();
         
         area= 0.5* base* height;
         System.out.println("Area:"+area);
          }
         }
