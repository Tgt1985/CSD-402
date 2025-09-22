import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args)  {

        // Initialize Scanner
        Scanner input = new Scanner(System.in);
        

        // Create the computer selection - Random Number 1-3
        int computerSelection = (int)(Math.random() * 3) +1;  // Adding 1 to retrieve 1,2 or 3
       
        // Ask user for their choice
        System.out.println("Please enter your selection: 1 for Rock, 2 for Paper, or 3 for Scissors: ");
        int userSelection = input.nextInt();


        
             if (computerSelection == 1 && userSelection == 3)
                System.out.println("The computer selection was Rock and the user selction was Scissors. The User has lost.");
                else if (computerSelection == 2 && userSelection == 1)
                    System.out.println("The computer selection was Paper and the user selction was Rock. The User has lost.");    
                else if (computerSelection == 3 && userSelection == 2)
                    System.out.println("The computer selection was Scissors and the user selction was Paper. The User has lost.");
                else if (computerSelection == 1 && userSelection == 2)
                System.out.println("The computer selection was Rock and the user selction was Paper. The User has Won!");
                else if (computerSelection == 2 && userSelection == 3)
                System.out.println("The computer selection was Paper and the user selction was Scissors. The User has won!");
                else if (computerSelection == 3 && userSelection == 1)
                System.out.println("The computer selection was Scissors and the user selction was Rock. The User has won!");

            else
                 System.out.println("Sorry, this was a draw. Both the computer and the user have chosen the same number.");

        
    }
}
