package xyz;

import java.util.Stack;

public class UndoFeature {
    public static void main(String[] args) {
        Stack<String> actions = new Stack<>();

        // Step 1: Push 3 actions
        actions.push("Write");
        actions.push("Delete");
        actions.push("Insert");

        System.out.println("All actions in stack: " + actions);

        // Step 2: Show last action using peek
        System.out.println("Last action (peek): " + actions.peek());

        // Step 3: Undo 2 actions (pop)
        actions.pop();
        actions.pop();

        // Step 4: Show what's left in stack
        System.out.println("Remaining actions in stack: " + actions);
    }
}
