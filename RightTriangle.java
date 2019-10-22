
public class RightTriangle
{
    public static void main(String[] args){
        triangle(3);

    }

    public static void triangle(int h){

        int n = 0;

        while(n <= h){

            int i = n;
            while(i < h){
                i++;

                System.out.print("-");

            }

            i = 0;
            while(i <= n){
                i++;

                System.out.print("*");

            }
            n++;

            System.out.println(" ");
        }

    }
}
