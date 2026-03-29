import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task Complete");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();
            sc.nextLine(); // fix input issue

            if (ch == 1) {
                System.out.print("Enter title: ");
                String t = sc.nextLine();

                System.out.print("Enter deadline: ");
                String d = sc.nextLine();

                tm.addTask(t, d);
            }
            else if (ch == 2) {
                tm.viewTasks();
            }
            else if (ch == 3) {
                System.out.print("Enter task number: ");
                int n = sc.nextInt() - 1;
                tm.markDone(n);
            }
            else if (ch == 4) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close(); // important
    }
}
