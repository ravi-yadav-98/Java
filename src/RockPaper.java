package first;
import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.*;

//import Math;
public class RockPaper
{
    public static void main(String[] args)
    {
        System.out.println("Welcome !!");
        int[] options = {3, 5,7}; //total matches in one go
        //Keyboard input
        Scanner sc = new Scanner (System.in);
        //random number class
        Random rand = new Random();
        int noOfMatches = options[rand.nextInt(options.length)];
        System.out.printf("Total Number of Matches to be played this time is %d \n", noOfMatches);

        String[] rps = {"r", "p", "s"};

        //computer move (random rps)
        String computerMove;
        //take user input

        System.out.println("Game Starts.....");

        String userMove;
        int computerScore = 0;
        int userScore = 0;
        int tiedMatch =0;
        int matchNo =0;
        while(matchNo < noOfMatches)
        {
            System.out.println("__________________________________________________");
            System.out.printf("Match Number: %s\n", matchNo);
            System.out.println("Pls Enter your Move: (r, p, or s) ");
            userMove = sc.nextLine();
            computerMove = rps[rand.nextInt(rps.length)];
            System.out.printf("Computer Move: %s \n", computerMove);
            if(userMove.equals(computerMove))
            {
                tiedMatch++;
            }

            else if(userMove.equals("r"))
            {
                if(computerMove.equals("p"))
                {
                    computerScore++;
                }
                else if(computerMove.equals("s"))
                {
                    userScore++;
                }
            }
            else if(userMove.equals("p"))
            {
                if(computerMove.equals("r"))
                {
                    userScore++;
                }
                else if(computerMove.equals("s"))
                {
                    computerScore++;
                }
            }
            else if(userMove.equals("s"))
            {
                if(computerMove.equals("p"))
                {
                    userScore++;
                }
                else if(computerMove.equals("r"))
                {
                    computerScore++;
                }
            }
            matchNo++;


        }
        System.out.println("-------------------------------------------");
        System.out.println("Final results !!!!");
        System.out.printf("Matches Tied: %d \n", tiedMatch);
        System.out.printf("Matches won by computer: %d \n", computerScore);
        System.out.printf("Matches won by You: %d \n", userScore);
        if(computerScore > userScore)
        {
            System.out.println("Computer won !!!,  You Loss");
        }
        else if(computerScore == userScore)
        {
            System.out.println(" Tournament Tied !!");

        }
        else
        {
            System.out.println("You won !!!, Congrats !!!!!");
        }




    }
}
