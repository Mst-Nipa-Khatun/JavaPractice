
package Exception;


public class ExceptionProblem {
     public static void main(String[] args) {
        int count=1;
        do{ 
          try{
            Scanner input= new Scanner(System.in);
        System.out.println("Enter two input for devide operation:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int result = num1/num2;
        System.out.println("Result:"+num1+"/"+num2+" = "+result);
        count=2;
            
        }catch(Exception e){
            System.out.println("Exception:"+e);
            System.out.println("Please Enter Integer");
        }
            
        }while(count==1);
        
    }
}
