package ss06_inheritance.bai_tap.Ex3ClassPointAndMoveablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speed={this.xSpeed,this.ySpeed};
        return speed;
    }

    @Override
    public String toString() {
        return super.toString()+", speed = "+ Arrays.toString(this.getSpeed());
    }
    public MovablePoint move(){
        super.setX(super.getX()+this.xSpeed);
        super.setY(super.getY()+this.ySpeed);
        return this;
    }
}
