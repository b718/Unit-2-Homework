
public class PowerOf3an5
{
    public static void main(String[] args){

        
       int i = 0;
       int tally = 0;
       
       while(i < 1000){
           
          
          if(i % 3==0 || i % 5 ==0){
              System.out.println(i);
              tally = tally + i;
              
            }
                    i++;

           
        }
       System.out.println(tally);
    }
}
