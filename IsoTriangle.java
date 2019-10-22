
public class IsoTriangle
{
   public static void main(String[] args){
       
       triangle(5);
       
    }
    
    public static void triangle(int h){
        
        int i =0;
        
        while(i <= h){
            
            int j = i;
            
            while(j < h){
                j++;
                System.out.print(" ");
                
                
            }
            
            j = 0;
            while(j <= (i*2)){
                j++;
                System.out.print("*");
                
                
            }
            
            
            
            
            i++;
            System.out.println("");
            
        }
        
        
        
        
    }
}
