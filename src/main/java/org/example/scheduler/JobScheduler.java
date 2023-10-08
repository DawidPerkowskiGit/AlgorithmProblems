package org.example.scheduler;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Thread.sleep;

public class JobScheduler {

    private List<CustomSchedule> schedules = new LinkedList<>();
    public void addSchedule(CustomSchedule task) {
        this.schedules.add(task);
    }

    private void sortSchedules() {
        this.schedules.sort(Comparator.comparing( a -> a.getTime()));
    }

    private void calculateTimeBetween() {
        if (this.schedules.size() > 1) {
            int initialTime = this.schedules.get(0).getTime();
            for (int i = 1 ; i < this.schedules.size() ; i++) {
                this.schedules.get(i).setTime(this.schedules.get(i).getTime() - initialTime);
                initialTime += this.schedules.get(i).getTime();
            }
        }
    }

    private void executeTasks() {
        for (CustomSchedule task: this.schedules
             ) {
            try {
                sleep(task.getTime());
                System.out.println("Executed task: " + task.getTask() + ", after " + task.getTime() + " milliseconds");

            }
            catch (Exception e) {
                System.out.println("Could not wait for the task to execute. Exception "+e );
            }
        }
    }

    public void executeScheduler() {
        this.sortSchedules();
        this.calculateTimeBetween();
        this.executeTasks();
    }
}
