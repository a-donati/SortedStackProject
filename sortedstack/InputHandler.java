package sortedstack;

import java.util.Scanner;

/**
 * Handle user input for adding user input to the stack.
 */
public class InputHandler {

    private final SortedStackManager stackManager = new SortedStackManager();

    /**
     * Start the input loop to add items to the stack. Users are able to
     * enter integers separated by a space, comma, or period. Type 'exit' in
     * order to exit the program.
     */
    public void start() {
        // Using try-with-resources to manage the Scanner, the scanner will be automatically closed when the try block exits
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Add items to a stack. Enter integers separated by a space, comma, or period. Type 'pop' to pop an item from the stack or 'exit' to quit:");
                String userInput = scanner.nextLine();

                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }

                if (userInput.equalsIgnoreCase("pop")) {
                    if (stackManager.getSize() > 0) {
                        Integer poppedItem = stackManager.pop();
                        System.out.println("Popped item: " + poppedItem);
                    } else {
                        System.out.println("The stack is empty. Cannot pop.");
                    }
                    System.out.println("Updated Stack: " + stackManager.getList());
                    continue; // Skip the input processing for numbers
                }

                stackManager.processInput(userInput);
                stackManager.sortList();

                if (stackManager.getSize() == 0) {
                    System.out.println("The stack is empty.");
                } else {
                    System.out.println("Stack: " + stackManager.getList());
                }
            }
        } // Scanner will be automatically closed here
    }
}
