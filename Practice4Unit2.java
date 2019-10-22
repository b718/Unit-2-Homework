
public class Practice4Unit2
{
    public static void main(String[] args){

        int a = 0;
        while(a <= 1000){

            a++;

            int b = 0;
            while(b<=1000){
                b++;

                double c = (Math.sqrt(a*a + b*b));
                if(a+b+c == 1000){
                    System.out.println(a*b*c);

                }

            }

        }

    
    }
}
