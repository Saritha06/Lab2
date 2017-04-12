import java.util.Scanner;

// Use conditional statement
public class Lab2 {
    public static void main(String[] args) {
        int userInput;//create int variable

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 100: ");//prompt user inout
        userInput = scan.nextInt();

        if ( userInput % 2 != 0){ //condition
            System.out.println("You entered an Odd number.");
        }else
        if(( userInput >=2 ) && (userInput <=25)){
            System.out.println("Even and less than 25");
        }else if ((userInput >=26) && (userInput <= 60)){
            System.out.println("Even");
        }else if (userInput > 60){
            System.out.println("Even");
        }else if (userInput % 2 == 0){
            System.out.println("You entered an Even number.");
        }else{
            System.out.println("Odd and over 60");
        }


       /* if (userInput % 2 == 0) {
            System.out.println(userInput + " is an Even");
        } else {
            System.out.println(userInput + " is an Odd");
        }
        System.out.println("Continue?(y/n): ");
        scan.next();
        System.out.println("Enter an integer between 1 and 100: ");
        userInput = scan.nextInt();
        if (userInput < 25) {
            System.out.println("Even and less than 25");
            System.out.println("Continue?(y/n): ");
            scan.next();
        }*/


    }

}

