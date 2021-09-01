import java.util.Scanner;
import java. util.Random;

class Game{
    Random rn = new Random();
    Scanner sc = new Scanner(System.in);
    private int user;
    private int computer;
    private int chance = 1;

    public Game(){
        System.out.println("Hello user, upto what range do u want to take this challenge? (Starts from 0)");
        int n = sc.nextInt();
        computer = rn.nextInt(n);
        System.out.println("Computer guessed the number, its ur turn to guess it right");
    }

    public void UserInput(){
        user = sc.nextInt();
    }

    public void challenge(){
        if(computer == user){
            System.out.println("You are right!!!");
        }
        else if(computer > user){
            System.out.println("Guess a number greater than "+user);
            UserInput();
            challenge();
            setChance();
        }
        else if(computer < user){
            System.out.println("Guess a number less than "+user);
            UserInput();
            challenge();
            setChance();
        }
    }

    public void setChance(){
        chance++;
    }

    public void getChance(){
        System.out.printf("Number of chances taken = "+chance);
    }
}

class GuessNumber {
    public static void main(String[] args){
         Game one = new Game();
         one.UserInput();
         one.challenge();
         one.getChance();
    }
}
