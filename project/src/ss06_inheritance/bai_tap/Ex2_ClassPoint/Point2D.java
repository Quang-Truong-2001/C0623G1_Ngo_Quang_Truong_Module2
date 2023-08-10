package ss06_inheritance.bai_tap.Ex2_ClassPoint;

import java.util.Arrays;

public class Point2D {
    private float x=0.0f;
    private float y=0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }


    public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float[] getXY(){
        float[] arrayXY={this.x,this.y};
        return arrayXY;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.getXY());
    }
}
