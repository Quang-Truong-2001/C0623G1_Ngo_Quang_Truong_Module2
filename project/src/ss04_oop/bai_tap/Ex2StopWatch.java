package ss04_oop.bai_tap;

import java.time.LocalTime;

public class Ex2StopWatch {

    public static void main(String[] args) {
        double[] numbers = new double[100000];
        double randomNumber;
        for (int i = 0; i < numbers.length; i++) {
            randomNumber = Math.random() * 100;
            numbers[i] = randomNumber;
        }
        Ex2StopWatch ex2StopWatch=new Ex2StopWatch();
        ex2StopWatch.start();
        ex2StopWatch.sortNumbers(numbers);
        ex2StopWatch.stop();
        int times=ex2StopWatch.getElapsedTime();
        System.out.println("Thời gian là: "+times + " s");
    }
    public void sortNumbers(double[] numbers){
        double temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
    private LocalTime startTime;
    private LocalTime endTime;

    public Ex2StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Ex2StopWatch() {
    }

    public LocalTime getStartTime() {
        return this.startTime;
    }
    public LocalTime getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = LocalTime.now();
    }

    public void stop() {
        this.endTime = LocalTime.now();
    }
    public int getElapsedTime(){
        return (this.endTime.getHour()-this.startTime.getHour())*36000+(this.endTime.getMinute()-this.startTime.getMinute())*60+(this.endTime.getSecond()-this.startTime.getSecond());
    }

}

