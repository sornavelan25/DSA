import java.util.Scanner;

    public class CheckNumber {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer number: ");
            int number = input.nextInt();
            if (number > 0) {
                System.out.println(number + " is a Positive number.");
            } else if (number < 0) {
                System.out.println(number + " is a Negative number.");
            } else {
                System.out.println("The number is Zero.");
            }
            input.close();
        }
    }


