import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to TaskManager-Level1!");
        Task tasks = new Task();

        while (true) {
            System.out.print("Your task? ");
            Scanner scan = new Scanner(System.in);
            String command = scan.next();

            if (command.equals("add")) {
                String task = scan.nextLine();
                tasks.add(task);

            } else if (command.equals("print")) {
                if (tasks.isEmpty()) {
                    System.out.println("Task List is empty! please try again");
                    continue;
                }
                tasks.print();

            } else if (command.equals("exit")) {
                System.out.println("Bye!");
                break;
            } else {
                scan.nextLine();
                System.out.println("Unknown command! please try again");
            }
        }
    }
}
