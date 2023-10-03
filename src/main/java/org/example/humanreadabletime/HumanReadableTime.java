package org.example.humanreadabletime;

/**
 * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
 *
 *     HH = hours, padded to 2 digits, range: 00 - 99
 *     MM = minutes, padded to 2 digits, range: 00 - 59
 *     SS = seconds, padded to 2 digits, range: 00 - 59
 *
 * The maximum time never exceeds 359999 (99:59:59)
 *
 */
public class HumanReadableTime {

    private int seconds = 0;

    private int minutes = 0;

    private int hours = 0;


    public String makeReadable (int time) {

        if (time < 0 || time > 359999) {
            return buildTime();
        }

        this.seconds = time % 60;
        if (time / 60 < 1) {
            return buildTime();
        }

        time = time / 60;
        this.minutes = time % 60;
        if (time / 60 < 1) {
            return buildTime();
        }

        this.hours = time / 60;
        return buildTime();
    }

    private String buildTime() {
        String hours = this.hours < 10 ? ("0" + this.hours) : this.hours + "";
        String minutes = this.minutes < 10 ? ("0" + this.minutes) : this.minutes + "";
        String seconds = this.seconds < 10 ? ("0" + this.seconds) : this.seconds + "";

        return hours + ":" + minutes + ":" + seconds;
    }

}
