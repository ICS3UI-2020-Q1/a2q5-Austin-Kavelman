import java.util.Scanner;

/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //Asks the user to enter a number to start playing
    System.out.println("Please enter a number to play FizzBuzz");

    //Create interger for number
    int num = input.nextInt();

    //Write constant for a number divisible by 3
    int DIVISIBLE_BY_3 = (num % 3);
    
    //Write constant for a number divisible by 5
    int DIVISIBLE_BY_5 = (num % 5);

    //Tells you if the number is divisible by 3, 5 or nothing
    if(DIVISIBLE_BY_3 == 0 && DIVISIBLE_BY_5 == 0) {
    System.out.println("You should say FizzBuzz");
    } else if(DIVISIBLE_BY_5 == 0) {
    System.out.println("You should say Buzz");
    } else if(DIVISIBLE_BY_3 == 0) {
    System.out.println("You should say Fizz");
    } else {
    System.out.println("You should say " + num);
    }

  }
}
