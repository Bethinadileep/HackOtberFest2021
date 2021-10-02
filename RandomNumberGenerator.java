import java.util.*;

public class Randomnumgenerator {

    public static void main(String args[])
    {
        //Mini Project -> checking Random Number(System Generated) is Equal to Our Number
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);

        int userNumber = 0;

        while(userNumber >= 0) {
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt();
            if(userNumber == myNumber) {
                System.out.println("WOOHOO...CORRECT NUMBER!!!");
                break;
            }
            else if(userNumber > myNumber) {
                System.out.println("your number is too large");
            }

            else {
                System.out.println("Your number is too small");
            }

        }

        System.out.print("My number was: ");
        System.out.println(userNumber);

    }
}
