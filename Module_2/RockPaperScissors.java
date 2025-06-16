
 // Sean Dudley
 // CSD-402 - Programming with Java - Module 2 - Selections and Funcitons
 // 6/15/2025



import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {
    public static void main(String[] args){


    
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Loop so you can replay
        boolean playAgain = true;
        while(playAgain){

            // Declare Variables
            @SuppressWarnings("unused")
            final int rock = 1;
            final int paper = 2;
            final int scissors = 3;

      
            // Get Choice from User

            System.out.print("Enter 1 for Rock, 2 for Paper or 3 for Scissors: ");

            int userInput = scanner.nextInt();

            //Get computer Choice add 1 to ignore the 0
            int computerInput = random.nextInt(3) + 1;



            // When User and Computer Tie
            if (userInput == computerInput) {
                System.out.print("The User chose " + userInput + "and The Computer chose " + computerInput + ", it was a tie. Please play again!");
            }


            // When the User Chooses Rock
            else if (userInput == 1) {
                if (computerInput == 2) {
                    System.out.print("The User chose " + userInput + " and The Computer chose " + computerInput + ", the Computer wins. Please play again!");
                
                } else {
                    System.out.print("The User chose " + userInput + " and The Computer chose " + computerInput + ", the User wins. Please play again!");
                }
            }


            // When the User Chooses Paper         
            else if (userInput == 2) {
                if (computerInput == 1) {
                    System.out.print("The User chose " + userInput + " and The Computer chose " + computerInput + ", the User wins. Please play again!");
                } else {
                    System.out.print("The User chose " + userInput + " and The Computer chose " + computerInput + ", the Computer wins. Please play again!");
                }
            }    
                      
            // When the User Chooses Scissors         
            else if (userInput == 3) {
                if (computerInput == 1) {
                    System.out.print("The User chose" + userInput + "and The Computer chose" + computerInput + ", the Computer wins. Please play again!");
                } else {
                    System.out.print("The User chose" + userInput + "and The Computer chose" + computerInput + ", the User wins. Please play again!");
                } 
            }    
            else {
                System.out.print("Invalid input.");
            }
                    

                        


            System.out.print("To play again, type 1 for Yes and 0 for No.");
            int again = scanner.nextInt();
            playAgain = (again == 1);
        }        
                                                                 
        scanner.close();
    }    

}






    

    


            
                 



        
