import java.util.Scanner;

public class RunningTally
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Running Tally");
        System.out.println("-------------");
        
        System.out.println("Lets type some numbers ! [Type negative to end]");
        //int a = sc.nextInt();
        
        int a = 1; //This code makes the entire code start
        int k = 0; //Remeber that within a while loop you can type anything
        while( a > 0){
            System.out.println("New number please ! [Negative to end]");
            a = sc.nextInt();
            if( a >0) {
            k = k + a; //this code just means k is adding a which is being reset every time
            
        }
       
       } 
            System.out.println("Your tally is this");
               System.out.println(k);

    } 
}
