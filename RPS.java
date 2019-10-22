import java.util.Scanner;
public class RPS
{
    public static void main(String[] args){
        String ans = "yes";

        Scanner sc = new Scanner(System.in);
        int humanchoice = 0;
        int wins = 0;
        int losses = 0;
        int ties = 0;

        System.out.println("Rock Paper Scissors");
        System.out.println("*******************");

        while(ans.equals("yes")){
            System.out.println("What do you choose?");
            System.out.println("[1] Rock [2] Paper [3] Scissors");

            int machinechoice = (int) (Math.random()*3)+1;

            if(humanchoice == 1 && machinechoice == 3){
                wins = wins + 1;
                System.out.println("You chose rock, the A.I. chose scissors");
                System.out.println("You win for now");

            }else if(humanchoice == 1 && machinechoice == 1){
                ties = ties + 1;
                System.out.println("You chose rock, the A.I. chose rock");

                System.out.println("We tie, you lose next time");

            }else if(humanchoice == 1 && machinechoice == 2){
                losses = losses + 1;
                System.out.println("You chose rock, the A.I. chose rock");

                System.out.println("You lose wetod.");

            }if(humanchoice == 2 && machinechoice == 1){
                wins = wins + 1;
                System.out.println("You chose Paper, the A.I. chose rock");

                System.out.println("You win for now");

            }else if(humanchoice == 2 && machinechoice == 2){
                ties = ties + 1;
                System.out.println("You chose paper, the A.I. chose paper");

                System.out.println("We tie, you lose next time");

            }else if(humanchoice == 2 && machinechoice == 3){
                losses = losses + 1;
                System.out.println("You chose paper, the A.I. chose scissors");

                System.out.println("You lose wetod.");
            }if(humanchoice == 3 && machinechoice == 2){
                wins = wins + 1;
                System.out.println("You chose scissors, the A.I. chose paper");

                System.out.println("You win for now");

            }else if(humanchoice == 3 && machinechoice == 3){
                ties = ties + 1;
                System.out.println("You chose scissors, the A.I. chose scissors");

                System.out.println("We tie, you lose next time");

            }else if(humanchoice == 3 && machinechoice == 1){
                losses = losses + 1;
                System.out.println("You chose scissors, the A.I. chose rock");

                System.out.println("You lose wetod.");

            }else if(humanchoice != 1 && humanchoice != 2 && humanchoice != 3){
                System.out.println("Please aquire a brain");
                System.out.println("Try again");
            }
            System.out.println("You won " + wins + " times");
            System.out.println("You tied " + ties + " times");
            System.out.println("You lost " + losses + " times");
            System.out.println("Would you like to play again? Yes or No");
            ans = sc.next();
        }
    }
}
