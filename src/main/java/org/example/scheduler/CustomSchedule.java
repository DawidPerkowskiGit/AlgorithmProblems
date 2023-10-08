package org.example.scheduler;

public class CustomSchedule {

    private String task;

    private int time;

    public CustomSchedule(String task, int time) {
        this.task = task;
        this.time = time;
    }

    public String getTask() {
        return task;
    }

    public int getTime() {
        return time;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
