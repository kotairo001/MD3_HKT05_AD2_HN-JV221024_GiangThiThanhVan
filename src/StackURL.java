import java.util.Scanner;
import java.util.Stack;

public class StackURL {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        int choice = 0;
        String URL = null;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************");
            System.out.println("1. Enter the URL you want to access");
            System.out.println("2. Go back");
            System.out.println("3. Exit");
            System.out.println("Input your choice");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input URL you want to excess");
                    input.nextLine();
                    URL = input.nextLine();
                    stack.push(URL);
                    break;
                case 2:
                    if (stack.size() > 1) {
                        stack.pop();
                        System.out.println("The last URL: " + stack.peek());
                    } else {
                        System.err.println("There no URL to go back");
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (choice < 3);
    }
}
