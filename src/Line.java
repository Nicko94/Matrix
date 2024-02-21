public class Line {
    // Ecuación vectorial: (x, y, z) = (Xo, Yo, Zo) + &(V1, V2, V3)
    // Ecuaciónes paramétricas:
    // X = Xo + &V1
    // Y = Yo + &V2
    // Z = Zo + &V3
    private Point p;
    private Point q;
    private Vector v;
    public Line(Point p, Point q){
        this.p = p;
        this.q = q;
        this.v = new Vector(p, q);
    }
    public Line(Point p, Vector v){
        this.p = p;
        this.v = v;
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
}
