import java.util.Scanner;


public class Bar
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bar");
        System.out.println("---");
        
        
        System.out.println("What character would you like to use?");
        String chara = sc.nextLine();
        
        System.out.println("How many would you like?");
        int x  = sc.nextInt();
        int k = 0;
        while( k  < x){
            k++;
            System.out.print(chara);
            
        }
        
       
        
      
        
        
        
        
     
    }
}
