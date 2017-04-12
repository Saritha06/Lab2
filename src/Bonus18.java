import java.util.Scanner;

/**
 * Created by USER on 4/11/2017.
 */
public class Bonus18 {
    public static void main(String[] args) {
        int userInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer: ");
        userInput = scan.nextInt();
        switch (userInput % 2 ){
            case 0:
                System.out.println(userInput + " is an even number");
                break;
            case 1:
                System.out.println(userInput + " is an Odd number");

        }
    }
}
