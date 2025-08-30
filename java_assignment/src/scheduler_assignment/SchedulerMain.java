package scheduler_assignment;

public class SchedulerMain {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Schedule 3 tasks using lambda expressions
        scheduler.scheduleTask(() -> System.out.println("Task 1: Printing every 2 seconds"), 2);
        scheduler.scheduleTask(() -> System.out.println("Task 2: Printing every 3 seconds"), 3);
        scheduler.scheduleTask(() -> System.out.println("Task 3: Printing every 5 seconds"), 5);

        // Let program run for 20 seconds before stopping
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.stopScheduler();
        System.out.println("Scheduler stopped.");
    }
}