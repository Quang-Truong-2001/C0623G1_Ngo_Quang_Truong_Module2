package ss04_oop.bai_tap;

public class Ex3Fan {
    public static void main(String[] args) {
        Ex3Fan fanOne=new Ex3Fan(2,true,5,"Blue");
        Ex3Fan fanTwo=new Ex3Fan(3,false,6,"Red");
        System.out.println("FanOne");
        System.out.println(fanOne.display());
        System.out.println("FanTwo");
        System.out.println(fanTwo.display());
    }
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed;
    private boolean status;
    private double radius;
    private String color;

    public Ex3Fan(int speed, boolean status, double radius, String color) {
        if(speed==1){
            this.speed=SLOW;
        } else if (speed==2){
            this.speed=MEDIUM;
        } else {
            this.speed=FAST;
        }
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getSpeed1(){
        String result;
        if(this.speed==1){
            result="SLOW";
        } else if (this.speed==2){
            result="MEDIUM";
        } else {
            result="FAST";
        }
        return result;
    }
    public String display(){
        if(this.status==true){
            return "Speed:"+this.speed+"\n"+
                    "Color:"+this.color+"\n"+
                    "Radius:"+this.radius+"\n"+
                    "Fan is on";
        } else {
            return "Color:"+this.color+"\n"+
                    "Radius:"+this.radius+"\n"+
                    "Fan is off";
        }
    }
}
