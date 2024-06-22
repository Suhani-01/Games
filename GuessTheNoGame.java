import java.util.Random;
import java.util.Scanner;

//Main method Class
public class GuessTheNoGame {
    public static void main(String args[]){
        Game obj=new Game();
        obj.takeUserInput();
    }
}

//Game is in this class
class Game{
    int number;
    int Guess;
    int Count=0;
    //setting a random number to guess
    Game(){
        Random random=new Random();
        number=random.nextInt(1,101);
    }
    //user guessing the number
    void takeUserInput(){
        Scanner sc=new Scanner(System.in);
        while(true){
             System.out.print("Guess the number ( range = 1 to 100 ): ");
             Guess=sc.nextInt();
             noOfGuess();
            if(isCorrectInput(Guess)){
                System.out.println("Total number of guesses : "+Count+"\nTerminating................");
                return;
            }
        }
    }
    //checking the Guess
    Boolean isCorrectInput(int Guess){
         if(number==Guess){
            System.out.println(Guess+" is Correct Guess......!Congratulations");
            return true;
         }
         else if(number>=Guess){
            System.out.println(Guess+" is Smaller than the original number");
            return false;
         }
         else{
         System.out.println(Guess+" is Greater than original number");
         return false;
         }
    }
    //counting number of guess
    void noOfGuess(){
        Count++;
    }
}
