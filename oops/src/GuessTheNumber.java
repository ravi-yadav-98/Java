import java.util.*;
public class GuessTheNumber {

    private int computerNum;
    private int numberOfGuess =0;
    Scanner sc = new Scanner(System.in);
    Random rm = new Random();

    //constructor
    public GuessTheNumber()
    {
        computerNum = rm.nextInt(101);
    }

    public int userInput(){
        System.out.println("Guess a Number in range[0-100]");
        int userNum = sc.nextInt();
        return userNum;
    }
    //check number is it is correct

    public void setNumberOfGuess(){
        numberOfGuess++;
    }
    public void getNumberOfGuess()
    {
        System.out.println(numberOfGuess);
    }
    public boolean isCorrectGuess(int myNum)
    {
        int flag =0;
        if(myNum<=100 && myNum>=0)
        {
            setNumberOfGuess();
            if(myNum == computerNum)
            {
                System.out.println("You guessed it right !!, The number is : "+ myNum);
                flag =1;
                sc.close();
            }
            else if(myNum < computerNum)
            {
                System.out.println("Your Number is less than the actual Numbe. ");
            }
            else if(myNum > computerNum)
            {
                System.out.println("Your Number is greater than the actual Numbe. ");
            }
            else {
                System.out.println("Please enter in range 0 to 100");
            }
        }
        if(flag ==1)
        {
            return  true;
        }
        else {
            return false;
        }
    }
}

class Play{
    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        boolean playGame = true;
        int userNum;
        while(playGame == true)
        {
            userNum = game.userInput();
            boolean myBool = game.isCorrectGuess(userNum);
            if(myBool == true)
            {
                System.out.print("Guessed in: ");
                game.getNumberOfGuess();
                playGame = false;
                break;

            }
            else{
                playGame = true;
            }
        }
    }
}
