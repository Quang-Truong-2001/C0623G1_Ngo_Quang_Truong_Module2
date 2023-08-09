package ss06_inheritance.bai_tap.Ex2_ClassPoint;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.setZ(z);
    }
    public float[] getXYZ(){
        float[] arrayXYZ={this.getX(),this.getY(),this.getZ()};
        return arrayXYZ;
    }

        @Override
    public String toString() {
        return Arrays.toString(this.getXYZ());
    }
}
