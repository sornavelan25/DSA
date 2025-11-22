public class AddInt {
    public static void main(String[] args) {
        if (args.length == 2) {
                // Step 2: Convert the string arguments to integers
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);

                // Step 3: Calculate the sum
                int sum = num1 + num2;

                // Step 4: Display the result
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
            } else {
                // Step 5: If not two numbers given, show error message
                System.out.println("Please provide exactly two integer numbers!");
            }
        }
    }


