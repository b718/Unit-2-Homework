
public class BoxGang
{
    public static void main(String[] args){
        squarePattern(4);

        
    }

    public static void squarePattern(int s){
        int number = 2;
        int i = 0;
        while(i < s){

            int f = 0;
            while(f < s){
                if(f == i){
                    System.out.print(number);
                    number = number +2;
                    f++;
                }else{
                    System.out.print("-");
                    f++;
                  
                    
                }

            }
            i++;
            System.out.println("");
        }

    }
}
