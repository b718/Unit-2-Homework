import java.util.Scanner;
public class D6
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String ans = "yes";
        int dicesrolled = 0;
        int dicestotal = 0;
        int diceamount = 0;

        System.out.println("D6");

        while(ans.equals("yes")){
            System.out.println("How many dice do you want rolled");

            dicesrolled = sc.nextInt();

            int k = 0;
            while( k<dicesrolled){
                k++;
                diceamount = (int) (Math.random()*6)+1;
                dicestotal = dicestotal + diceamount;
                System.out.print(diceamount + " ");


            }
                        System.out.println("");

            System.out.println("Your total is " + dicestotal);
            System.out.println("");

            System.out.println("Would you like to go again? Yes or No");
            ans = sc.next();
        }

    }
}
