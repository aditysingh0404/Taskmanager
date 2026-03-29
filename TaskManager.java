import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(String title, String deadline) {
        tasks.add(new Task(title, deadline));
        System.out.println("Task added!");
    }

    public void viewTasks() {
        if (tasks.size() == 0) {
            System.out.println("No tasks.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }

    public void markDone(int index) {
        if (index < 0 || index >= tasks.size()) {
            System.out.println("Invalid task.");
            return;
        }

        tasks.get(index).markCompleted();
        System.out.println("Task completed!");
    }
}

    