import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;

public class TaskManager {

    private final List<Task> taskList;

    public TaskManager() {
        taskList = new LinkedList<Task>();
    }

    public void addTask(final String taskTitle, final String taskDescription) {
        taskList.add(new Task(taskTitle, taskDescription));
    }

    public void saveAndUpdateTasks() {
        BufferedWriter writer;
        File file;
        try {
            file = new File("C:\\Users\\Adam\\Desktop\\TaskTest\\tasks.dat");
            writer = new BufferedWriter(new FileWriter(file));
            for (final Task task : taskList) {
                writer.append(task.getTaskTitle() + "~" + task.getTaskDescription() + "\n");
            }
            writer.flush();
            writer.close();
            Organizer.log("Finished saving tasks and descriptions.");
        } catch (final Exception e) {
            Organizer.log("Error saving task list.");
        }
    }

    public Task getTaskByTitle(final String taskTitle) {
        for (final Task task : taskList) {
            if (task.getTaskTitle().equalsIgnoreCase(taskTitle)) {
                return task;
            }
        }
        return null;
    }

    public String getTaskDescription(final String taskTitle) {
        for (final Task task : taskList) {
            if (task.getTaskTitle().equalsIgnoreCase(taskTitle)) {
                if (task.getTaskDescription() != "") {
                    return task.getTaskDescription();
                } else {
                    break;
                }
            }
        }
        return "Could not find matching task description.";
    }

}
