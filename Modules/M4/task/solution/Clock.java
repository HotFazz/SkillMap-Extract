// REPOBEE-SANITIZER-SHRED

/**
 * A simple class modelling a 12-hour clock
 * @author Linus Östlund
 * @author Gabriel Skoglund
 */
public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    private static final int SECONDS_LOWER_LIMIT = 0;
    private static final int SECONDS_UPPER_LIMIT = 60;
    private static final int MINUTES_LOWER_LIMIT = 0;
    private static final int MINUTES_UPPER_LIMIT = 60;
    private static final int HOURS_LOWER_LIMIT = 1;
    private static final int HOURS_UPPER_LIMIT = 13;

    /**
     * Create a clock with the time set to 12:00:00
     */
    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    /**
     * Create a new clock with the set time. The provided time units will only be used
     * if the fall in the correct span (1-12 for hours, 0-59 for minutes and seconds)
     * @param hours the hour to set the clock to
     * @param minutes the minute to set the clock to
     * @param seconds the second to set the clock to
     */
    public Clock(int hours, int minutes, int seconds) {
        this(); // Call the no argument constructor to set default values
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    /**
     * Set the current hour of the clock, the time will only be updated if the provided
     * value is in the range 1-12 (inclusive)
     * @param hours the hour to set the clock to.
     */
    public void setHours(int hours) {
        this.hours = hours < HOURS_LOWER_LIMIT || hours >= HOURS_UPPER_LIMIT ? this.hours : hours;
    }

    /**
     * Set the current minute of the clock, the time will only be updated if the provided
     * value is in the range 0-60 (inclusive)
     * @param minutes the hour to set the clock to.
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes < MINUTES_LOWER_LIMIT || minutes >= MINUTES_UPPER_LIMIT ? this.minutes : minutes;
    }

    /**
     * Set the current second of the clock, the time will only be updated if the provided
     * value is in the range 0-60 (inclusive)
     * @param seconds the hour to set the clock to.
     */
    public void setSeconds(int seconds) {
        this.seconds = seconds < SECONDS_LOWER_LIMIT || seconds >= SECONDS_UPPER_LIMIT ? this.seconds : seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    /**
     * @return A string representation of the current time of the form HH:MM:SS
     */
    @Override
    public String toString() {
        return (hours < 10 ? "0" + hours : hours) + ":" +
               (minutes < 10 ? "0" + minutes : minutes) + ":" +
               (seconds < 10 ? "0" + seconds : seconds);

        // Alternate version with format string
        // return "%02d:%02d:%02d".formatted(hours, minutes, seconds);
    }

    /**
     * Progress the time by one second
     */
    public void tick() {
        seconds++;
        if (seconds >= SECONDS_UPPER_LIMIT)
            minutes++;
        if (minutes >= MINUTES_UPPER_LIMIT)
            hours++;
        seconds %= SECONDS_UPPER_LIMIT;
        minutes %= MINUTES_UPPER_LIMIT;
        hours = hours >= HOURS_UPPER_LIMIT ? HOURS_LOWER_LIMIT : hours;
    }

    /**
     * Progress the time by the specified number of seconds. Will print the current time after each time
     * the seconds are updated.
     * @param seconds the number of seconds to increase the time by.
     */
    public void tick(int seconds) {
        for (int i = 0; i < seconds; i++) {
            tick();
            System.out.println(this);
        }
    }
}