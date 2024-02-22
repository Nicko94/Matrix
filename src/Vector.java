public class Vector {
    private float x = 0F;
    private float y = 0F;
    private float z = 0F;
    private float magnitude = 0F;
    private Point origin = new Point(0, 0, 0);
    public Vector(Point o, Point p){ // Defined from a point with a point origin
        this.x = p.getX() - o.getX();
        this.y = p.getY() - o.getY();
        this.z = p.getZ() - o.getZ();
        this.magnitude = calculateMagnitude(this.x, this.y, this.z);
        System.out.println("Created new VECTOR >> [X: " + this.x + ", Y: " + this.y + ", Z: " + this.z + "]");
    }
    public Vector(Point p){
        this.x = p.getX();
        this.y = p.getY();
        this.z = p.getZ();
        this.magnitude = calculateMagnitude(this.x, this.y, this.z);
        System.out.println("Created new VECTOR >> [X: " + this.x + ", Y: " + this.y + ", Z: " + this.z + "]");
    }
    private float calculateMagnitude(float x, float y, float z){
        return (float) Math.sqrt(x * y * z);
    }
    public float getMagnitude(){
        return this.magnitude;
    }
    public Point getOrigin(){
        return this.origin;
    }
    public float getA(){
        return this.x;
    }
    public float getB(){
        return this.y;
    }
    public float getC(){
        return this.z;
    }
    
    /* OLD CONSTRUCTORS */

    //public Vector(float x, float y, float z){ // Defined from the coordinates of a point
    //    this.origin = new Point(0F, 0F, 0F);
    //    this.x = x;
    //    this.y = y;
    //    this.z = z;
    //    this.magnitude = calculateMagnitude(x, y, z);
    //    System.out.println("Created new vector >> [X: " + x + ", Y: " + y + ", Z: " + z + "]");
    //}
    //public Vector(Point p){ // Defined from a point
    //    this.origin = new Point(0, 0, 0);
    //    this.x = p.getX();
    //    this.y = p.getY();
    //    this.z = p.getZ();
    //    this.magnitude = calculateMagnitude(x, y, z); // Check this
    //    System.out.println("Created new vector >> [X: " + x + ", Y: " + y + ", Z: " + z + "]");
    //}
    //public Vector(float x, float y, float z, Point p){ // Defined from the coordinates of a point with a point origin
    //    this.origin = p;
    //    this.x = x;
    //    this.y = y;
    //    this.z = z;
    //    this.magnitude = calculateMagnitude(x, y, z); // Wrong?
    //    System.out.println("Created new vector >> [X: " + x + ", Y: " + y + ", Z: " + z + "]");
    //}
    //public Vector(Point p, float x, float y, float z){ // Defined from a point with the coordinates of the origin
    //    this.origin = new Point(x, y, z);
    //    this.x = p.getX();
    //    this.y = p.getY();
    //    this.z = p.getZ();
    //    this.magnitude = calculateMagnitude(x, y, z); // Wrong
    //    System.out.println("Created new vector >> [X: " + x + ", Y: " + y + ", Z: " + z + "]");
    //}
    //public Vector(Point p, Point q){ // Defined from a point with a point origin
    //    this.origin = p;
    //    this.x = q.getX();
    //    this.y = q.getY();
    //    this.z = q.getZ();
    //    this.magnitude = calculateMagnitude(this.x, this.y, this.z);
    //    System.out.println("Created new vector >> [X: " + this.x + ", Y: " + this.y + ", Z: " + this.z + "]");
    //}
}
