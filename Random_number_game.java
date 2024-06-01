import java.util.Random;
import java.util.Scanner;

class Game {
   public int number;
   public  int input_number;
   public int no_of_guess;



   Game(){
       Random rand = new Random();
       this.number = rand.nextInt(100);
   }
   int take_input_user(){
       System.out.println("Guess the number ");
       Scanner sc = new Scanner(System.in);
       input_number = sc.nextInt();

       return 0;
   }
   boolean is_correct_number(){
       no_of_guess++;
       if (input_number == number){
           System.out.format("yes you gussed it ,you number is %d right  " ,number );
           System.out.println("\n");
           System.out.format("Your attempt %d",no_of_guess);
           System.out.println("\n");
       } else if (input_number>number) {
           System.out.println("too high...");
       }
       else if (input_number<number){
           System.out.println("too low...");
       }



       return false;

   }


}




public class Random_number_game {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.take_input_user();
            b = g.is_correct_number();
            System.out.println(b);




        }
    }
}
