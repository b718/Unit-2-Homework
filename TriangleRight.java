
public class TriangleRight
{
    public static void main(String[] args){
        box(4);
        
    }
    
    public static void box(int h){
        int number = 0;
        int y = 0;
        
        while(y<= h){
            
            int x = 0;
            
            while(x<= h){
                
                if(x==y){
                    x++;
                    System.out.print(number = number + 2);
                }else{
                    x++;
                    System.out.print("-");
                    
                }
                
                
            }
            
            
            
            
            
         y++;
         System.out.println(" ");
        }
        
        
        
    }
}
