package com.mycompany.problemsolving;


public class Array2DPb2 {

    public static void main(String[] args) {
        //Scanner input=new Scanner(System.in);
//        a=input.nextInt();
//        System.out.println("Enter:");
        int[][] num = new int[3][3];

        int a=1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                num[i][j] = a;
                a++;

            }
            
          
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
               
                System.out.print(" "+num[i][j]);
            }
                          System.out.println();
  
            }
    }

}
