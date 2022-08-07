import javax.sound.midi.Soundbank;
import  java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("You are going to become an adult");
            case 23 -> System.out.println("You are going to join a job");
            case 30 -> System.out.println("get married");
            default -> System.out.println("you are retired ");
        }
    }
}
