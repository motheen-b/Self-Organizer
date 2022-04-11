public class Task {

    private boolean isComplete;
    private String taskTitle;
    private String taskDescription;

    public Task() {}

    public Task(final String taskTitle, final String taskDescription) {
        this.taskTitle = taskTitle;
        this.taskDescription = taskDescription;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(final boolean complete) {
        isComplete = complete;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(final String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(final String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
