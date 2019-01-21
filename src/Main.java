import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to TaskManager-Level1!");
        Scanner scan = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();

        while (true) {
            try {
                System.out.print("Your task? ");
                String command = scan.next();

                if (command.equals("todo")) {
                    String description = scan.nextLine().trim();
                    if (description.equals("")) {
                        throw new TaskManagerException("Error: Empty description for TODO!!");
                    }
                    tasks.add(new Task(description));
                    System.out.println("Tasks in the list: " + tasks.size());

                } else if (command.equals("deadline")) {
                    String[] arr = scan.nextLine().split("/by");
                    if (arr[0].trim().equals("") || arr.length == 1 || arr[1].trim().equals("")) {
                        throw new TaskManagerException("Error: Empty description for deadline!!");
                    }
                    tasks.add(new Task(arr[0].trim(), arr[1].trim()));
                    System.out.println("Tasks in the list: " + tasks.size());

                } else if (command.equals("print")) {
                    if (tasks.isEmpty()) {
                        System.out.println("Task List is empty! please try again");
                        continue;
                    }
                    for (int i = 0; i < tasks.size(); i++) {
                        Task task = tasks.get(i);
                        System.out.println("[" + (i+1) + "]\tdescription: " + task.getDescription());
                        System.out.println("\tis done? " + task.getCompletion());
                        if (!task.deadlineIsEmpty()) {
                            System.out.println("\tdo by: " + task.getDeadline());
                        }
                    }

                } else if (command.equals("exit")) {
                    System.out.println("Bye!");
                    break;
                } else {
                    scan.nextLine();
                    System.out.println("Unknown command! please try again");
                }
            } catch (TaskManagerException e) {
                System.out.println(e.getMessage());
            }
        }

        scan.close();
    }
}
