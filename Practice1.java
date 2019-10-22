
public class Practice1
{
    public static void main(String[] args){
        int sum = 0;

        int num = 0;
        while(num < 1000){
            if(num % 3 == 0 || num % 5 == 0){
                sum = sum + num;

            }
            num = num + 1;

        }
        System.out.println(sum);

    }
}