package scheduler_assignment;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskScheduler {
    private final ScheduledExecutorService scheduler;

    // Constructor initializes thread pool
    public TaskScheduler() {
        scheduler = Executors.newScheduledThreadPool(5);
    }

    // Method to schedule tasks
    public void scheduleTask(Task task, int intervalInSeconds) {
        scheduler.scheduleAtFixedRate(() -> task.execute(),
                0, intervalInSeconds, TimeUnit.SECONDS);
    }

    // Shutdown method (optional)
    public void stopScheduler() {
        scheduler.shutdown();
    }
}