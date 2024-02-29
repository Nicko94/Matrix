package Algebra;

public class Point {
    private float x = 0F;
    private float y = 0F;
    private float z = 0F;
    public Point(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Created new POINT >> [X: (" + x + "), Y: (" + y + "), Z: (" + z + ")]");
    }

    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public float getZ(){
        return this.z;
    }
}
