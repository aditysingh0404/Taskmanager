public class Task {
    String title;
    String deadline;
    boolean isCompleted;

    public Task(String title, String deadline) {
        this.title = title;
        this.deadline = deadline;
        this.isCompleted = false;
    }

    public void markCompleted() {
        isCompleted = true;
    }

    public String toString() {
        return title + " | " + deadline + " | " + isCompleted;
    }
}