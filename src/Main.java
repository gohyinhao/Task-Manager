import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to TaskManager-Level1!");
        Scanner scan = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.print("Your task? ");
            String command = scan.next();

            if (command.equals("todo")) {
                String description = scan.nextLine();
                tasks.add(new Task(description));
                System.out.println("Tasks in the list: " + tasks.size());

            } else if (command.equals("deadline")) {
                String[] arr = scan.nextLine().split("/by");
                tasks.add(new Task(arr[0], arr[1]));
                System.out.println("Tasks in the list: " + tasks.size());

            } else if (command.equals("print")) {
                if (tasks.isEmpty()) {
                    System.out.println("Task List is empty! please try again");
                    continue;
                }
                for (int i = 0; i < tasks.size(); i++) {
                    Task task = tasks.get(i);
                    System.out.println("[" + (i+1) + "]\tdescription:" + task.getDescription());
                    System.out.println("\tis done? " + task.getCompletion());
                    if (!task.getDeadline().equals("NIL")) {
                        System.out.println("\tdo by:" + task.getDeadline());
                    }
                }

            } else if (command.equals("exit")) {
                System.out.println("Bye!");
                break;
            } else {
                scan.nextLine();
                System.out.println("Unknown command! please try again");
            }
        }

        scan.close();
    }
}
