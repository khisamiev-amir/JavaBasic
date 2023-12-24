package OOP.Encapsulation.Task2610;

import Basic.Exceptions.task2610;

public class Watch {
    private int hour;
    private int minutes;
    private int seconds;

    @Override
    public String toString() {//что делать пабликом, а что нет, в конструкторах методах классах
        return "Watch{" +
                "hour=" + hour +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }

    public Watch(int hour, int minutes, int seconds) throws task2610 {
        if((hour>23||hour<0)||(minutes>59||minutes<0)||(seconds>59||seconds<0)){
            throw new task2610("Введено некорректное время");
        }
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }



    public int getHour() {
        return hour;
    }

    public void setHour() {
        if (hour == 23) {
            this.hour = 0;
        } else {
            this.hour = hour + 1;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes() {
        if (minutes == 59) {
            this.minutes = 0;
            setHour();
        } else {
            this.minutes = minutes + 1;
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds() {
        if (seconds == 59) {
            this.seconds = 0;
            setMinutes();
        } else {
            this.seconds = seconds + 1;
        }
    }
}
