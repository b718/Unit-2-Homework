
public class Fibonacci
{
    public static void main(String[] args){
        
        int fnumber = 0;
        int snumber = 1;
        int finnumber = 1;
        
        int n = 0;
        while(n <= 10){
            finnumber = fnumber + snumber;
            fnumber = snumber;
            snumber = finnumber;
            n++;
            System.out.print(fnumber + " ");
        }
        
        
        
    }
}
