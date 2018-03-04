package stack;

import java.util.Scanner;

/**
 * Created by AC15 on 18/02/2018
 */
public class StackApplication {
    public static void main(String[] args) {
        Stack<String> arrayStack = new ArrayStack<>();
        Stack<String> linkedStack = new LinkedStack<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = true;

        System.out.println("Choose an option.\n" +
                "0: Quit");

        while (quit) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    quit = false;
                    break;
            }
        }

        scanner.close();
    }
}
