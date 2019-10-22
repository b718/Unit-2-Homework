import java.util.Scanner;
public class triangle
{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Triangle");
        System.out.println("********");

        System.out.println("What do you want it made of?");
        String chara = sc.nextLine();
        System.out.println("How tall?");
        int a = sc.nextInt();
        
        for(int k = 0; k < a; k++){
            
        for(int j = 0; j <= k; j++){
            System.out.print(chara);
            
            
        }
            
        System.out.println("");
    }
            
         


        
    }
}
