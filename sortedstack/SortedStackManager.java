package sortedstack;

import java.util.Stack;
import java.util.Collections;

/**
 * Manage the operations on the stack of integers
 */
public class SortedStackManager {
    // Code reuse - using Stack from java collection
    private final Stack<Integer> intsList = new Stack<>();

    /**
     * Process user input to add integers to the stack.
     *
     * @param userInput string from the user containing their input
     */
    public void processInput(String userInput) {
        String regex = "[,\\.\\s]+";
        try {
            String[] stringArray = userInput.split(regex);
            for (String str : stringArray) {
                if (!str.trim().isEmpty()) {
                    int parsedInput = Integer.parseInt(str.trim());
                    intsList.push(parsedInput); // Update to push
                }
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input. Please enter only integers.");
        }
    }

    /**
     * Pop an item off the stack and return it.
     *
     * @return The number removed from the stack.
     */
    public Integer pop() {
        if (!intsList.isEmpty()) {
            return intsList.pop();
        }
        return null; // Return null if the stack is empty
    }

    /**
     * Return the size of the stack.
     *
     * @return The number of elements within the stack.
     */
    public int getSize() {
        return intsList.size();
    }

    /**
     * Sort the elements within the stack in ascending order.
     * Code reuse - use already existing .sort() method from Collections library
     */
    public void sortList() {
        Collections.sort(intsList);
    }

    /**
     * Return the stack integers.
     *
     * @return The stack of integers.
     */
    public Stack<Integer> getList() {
        return intsList;
    }
}
