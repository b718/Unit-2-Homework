import java.util.Scanner;
public class Power2
{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What numbers");
        int n = sc.nextInt();
        
        int i = 0;
        while(i < 10){
            i++;
            
            if (n % n == 0){
                
                int f = (int) (Math.pow(n,i));
                System.out.println(f);
                
                
            }
            
            
            
            
            
        }
        
        
        
        
    }

}
