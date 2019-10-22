import java.util.Scanner;
public class NumberGuess
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Number Guessing");
        System.out.println("***************");

        int guess = 0;
        int tries = 0;
        int ans = (int) (Math.random()*100)+1;
            System.out.println("What is your guess?");

        while(guess != ans){
            guess = sc.nextInt();

            tries = tries + 1;

            if(guess > ans){
                System.out.println("Too High");

            } else if (guess < ans){
                System.out.println("Too Low");

            

            }
        }
        System.out.println("Congrats, you guessed the right number " + ans);
        System.out.println("It took " +tries+ " tries");
    }
}
