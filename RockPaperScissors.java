import java.util.Scanner;
import java.util.Random;
class RockPaperScissors{
    public static void main(String args[]){
        //making of rock paper scissors
        Scanner z = new Scanner(System.in);
        System.out.print("Choose 1,2,3 for rock,paper,scissor respectively : ");
        int p1 = z.nextInt();
        System.out.print("Computer choose: ");
        Random rand = new Random();
        int a = rand.nextInt(1,4);
        z.close();
        //Enhance Switch
        switch(a){
            case 1 -> System.out.println("rock");
            case 2 -> System.out.println("paper");
            case 3 -> System.out.println("scissor");
        }
        if(p1==a){
            System.out.println("it's a tie");
        }
         else if((p1==1 && a==2) || (p1==2 && a==3) || (p1==3 && a==1)){
            System.out.println("computer won!!");
        }
        else if((p1==1 && a==3) || (p1==2 && a==1) || (p1==3 && a==2)){
            System.out.println("You Won!!");
        }
        else{
            System.out.println("Invalid number");
        }
    }
    
}