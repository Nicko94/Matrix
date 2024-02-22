public class Line {
    // Ecuación vectorial: (x, y, z) = (Xo, Yo, Zo) + &(V1, V2, V3)
    // Ecuaciónes paramétricas:
    // X = Xo + &V1
    // Y = Yo + &V2
    // Z = Zo + &V3
    private Point p;
    private Point q;
    private Vector v;
    //private float scalar; // Scalar provided in calculatePoint() method, kept here for future usage in object instances
    public Line(Point p, Point q){
        this.p = p;
        this.q = q;
        this.v = new Vector(p, q);
        //this.scalar = 0;
    }
    public Line(Point p, Vector v){
        this.p = p;
        this.v = v;
        //this.scalar = 0;
    }
    public Point getPoint(){
        return this.p;
    }
    public Point getAlternativePoint(){
        return this.q;
    }
    public Vector getVector(){
        return this.v;
    }
    public Point calculatePoint(float scalar){
        float x = this.p.getX() + scalar * this.v.getA();
        float y = this.p.getY() + scalar * this.v.getB();
        float z = this.p.getZ() + scalar * this.v.getC();
        return new Point(x, y, z);
    }
}
