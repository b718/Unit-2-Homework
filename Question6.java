
public class Question6
{
    public static void displaybox(int width , int height){

        int h = 0;

        while(h < height){
            h++;
            //System.out.print(" ");
            //System.out.print("$");

            int w = 0;

            while(w < width){

                w++;
                //System.out.print(" ");
                System.out.print("$");

            }
            System.out.println(" ");
        }
       
    }

    public static void box(){

        displaybox(6,3);

    }
}
