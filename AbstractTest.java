
package Abstraction;

public class AbstractTest {
    public static void main(String[] args) {
        MoileUserAbstract mu;
        
        mu= new RahimAbstract();
        mu.sendMessage();
        
        mu= new KarimAbstract();
        mu.sendMessage();
    }
    
}
