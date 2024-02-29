package Algebra;

public class Plane {
    private Point p;
    private Point q;
    private Point r;
    private float d; // Término independiente de la ecuación general del plano
    private Vector normal;

    // Un plano tiene 3 tipos de ecuaciones: a)Ecuación general b)Ecuación segmentaria c)Ecuación vectorial paramétrica

    private Plane(Point p, Point q, Point r){
        this.p = p;
        this.q = q;
        this.r = r;
        Vector v = new Vector(p, q);
        Vector w =  new Vector(p, r);
        this.normal = VectorOperation.crossProduct(v, w);
    }
    private Plane(Point p, Vector n){
        this.p = p;
        this.normal = n;
    }
    private void isInPlane(Point p){

    }
    // Getters
    public Point getPoint(){
        return this.p;
    }
    public Point getPoint2(){
        return this.q;
    }
    public Point getPoint3(){
        return this.r;
    }
    public Vector getVector(){
        return this.normal;
    }
}
