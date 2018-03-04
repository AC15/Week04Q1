package stack;

import java.util.Scanner;

/**
 * Created by AC15 on 18/02/2018
 */
public class StackApplication {
    private static Stack<String> arrayStack = new ArrayStack<>();
    private static Stack<String> linkedStack = new LinkedStack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = true;

        while (quit) {
            System.out.println("Choose an option.\n" +
                    "0: Quit\n" +
                    "1: Add\n" +
                    "2: Top");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    quit = false;
                    break;
                case 1:
                    System.out.print("Input string: ");
                    String input = scanner.next();
                    add(input);
                    break;
                case 2:
                    top();
                    break;
            }
        }

        scanner.close();
    }

    private static void add(String input) {
        arrayStack.push(input);
        linkedStack.push(input);
    }

    private static void top() {
        System.out.println(arrayStack.top());
        System.out.println(linkedStack.top());
    }
}
