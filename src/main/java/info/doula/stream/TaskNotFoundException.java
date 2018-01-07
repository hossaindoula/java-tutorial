package info.doula.stream;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(String id) {
        super("No task found for id: " + id);
    }
}
