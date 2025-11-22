public class Sample {
    public static void main(String[] args) {
        // Step 1: Check if an argument is given
        if (args.length > 0) {
            // Step 2: Take the first argument (name)
            String name = args[0];

            // Step 3: Print the welcome message
            System.out.println("Welcome " + name);
        } else {
            // Step 4: If no argument is passed
            System.out.println("No name provided!");
        }
    }
}


