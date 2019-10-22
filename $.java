
public class $
{
    public static void box(int width, int height){
        
        int n = 0;
        
        while(n < height){
            
                int x = 0;
                while(x < width){
                    x++;
                    System.out.print("$" + " ");
                    
                }
            
            
            n++;
            System.out.println(" ");
        }
        
        
        
    }
    
    
    public static void main(String[] args){
        box(6,3);
        
    }
}
