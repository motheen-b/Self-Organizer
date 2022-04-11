public class Organizer {

    private final TaskManager taskManager;

    public Organizer() {
        taskManager = new TaskManager();
    }

    public TaskManager getTaskManager() {
        return taskManager;
    }

    public static void main(final String... args) {
        Organizer organizer = new Organizer();
        organizer.getTaskManager().addTask("Test1", "test2");
        organizer.getTaskManager().addTask("Test3", "test4");
        String taskDescription = organizer.getTaskManager().getTaskDescription("Test1");
        log(taskDescription);
        organizer.getTaskManager().saveAndUpdateTasks();
    }

    public static void log(final Object o) {
        System.out.println(o);
    }
}
