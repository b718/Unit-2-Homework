
public class Practice3Unit2
{
    public static void main(String[] args){
        int naturalnumbers = 0;

        int i = 0;
        int totalnumber1 = 0;
        int totalnumber2 = 0;
        int totalnumber3 = 0;
        while(i < 100){
            i++;
            int n = (int)Math.pow(i,2);
            totalnumber1 = totalnumber1 + n;


        }
        int f = 0;
        while(f < 100){
            f++;
            totalnumber2 = totalnumber2 + f;
            //int j = (int)Math.pow(totalnumber2,2);
            //totalnumber3 = totalnumber3 + j;
        }
        System.out.println(totalnumber2*totalnumber2 - totalnumber1);

    }
}

