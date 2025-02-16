import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char userChoice;
        
        do {
            // Display Menu
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            int choice = input.nextInt();
            
            switch (choice) {
                case 1: 
                    // Classify Number
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();
                    
                    // Classify as positive, negative, or zero
                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }

                    // Check if the number is even or odd
                    if (number % 2 == 0) {
                        System.out.println("It is also an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;
                
                case 2:
                    // Multiplication Table
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();
                    System.out.println("Multiplication Table for " + tableNumber + ":");
                    
                    // Generate table using for loop
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;
                
                case 3:
                    // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                
                default:
                    // Handle invalid choice
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }
            
            // Ask to continue or exit
            if (choice != 3) {
                System.out.print("Do you want to return to the menu? (Y/N): ");
                input.nextLine(); // Consume newline
                userChoice = input.nextLine().toUpperCase().charAt(0);
            } else {
                userChoice = 'N';
            }
            
        } while (userChoice == 'Y');
        
        input.close();
    }
}


