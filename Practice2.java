
public class Practice2
{
    public static void main(String[] args){
        int tally = 0;
        int limit = 0;
        int fnumber = 0; //first number
        int snumber = 1; //second number
        int finnumber = 2; //final number for first series
        while(finnumber < 4000000){
            finnumber = fnumber + snumber;
            fnumber = snumber;
            snumber = finnumber;
           
            if(finnumber % 2 == 0){
                tally = tally + finnumber;
            }
            

        }
        System.out.println(tally);

    }
}
