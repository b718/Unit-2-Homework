import java.util.Scanner;

public class Question7
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ans = "yes";
        int diceamount = 0;
        int amountdice = 0;
        int diceside = 0;

        while(ans.equals("yes")){
            System.out.println("How many dice?");
            amountdice  = sc.nextInt();
            System.out.println("How many sides?");
            diceside  = sc.nextInt();
            int k = 0;
            
            int tally = 0;
            while(k < amountdice){
                k++;
                diceamount = rollDie(diceside);

                System.out.print(diceamount + " ");
                tally = tally + diceamount;

            }

            System.out.println("Your tally is " + tally);
            System.out.println("Play again? Yes Or No");
            ans = sc.next();
        }
    }

    public static int rollDie(int diceside){
        Scanner sc = new Scanner(System.in);

        //System.out.println("How many dice?");
        // dice  = sc.nextInt();
        // System.out.println("How many sides?");
        //dice  = sc.nextInt();
        //diceside = (Math.random()*diceside)+1;
        return (int)(Math.random()*diceside)+1;//return statements can be pretty weird make sure to look on this
    } 
}
