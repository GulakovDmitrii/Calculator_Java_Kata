import java.util.Scanner;

public class SingleLineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter expression (e.g. 2 + 2): ");
        String input = scanner.nextLine();
        
        String[] tokens = input.split(" ");
        int num1 = Integer.parseInt(tokens[0]);
        char operation = tokens[1].charAt(0);
        int num2 = Integer.parseInt(tokens[2]);
        
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation");
                return;
        }
        
        System.out.println("Result: " + result);
        System.out.println("Done");
    }
}

Sun, Feb 4, 2024, 8:57 pm

+ New Chat
Conversations
Plan: Free

