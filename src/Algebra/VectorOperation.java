package Algebra;

public class VectorOperation {
    private VectorOperation(){
        System.out.println("Stop it, get some help");
    }
    public static Vector addition(Vector v, Vector w){ // May be call it add()
        float x = v.getA() + w.getA();
        float y = v.getB() + w.getB();
        float z = v.getC() + w.getC();
        Point o = new Point(0, 0, 0);
        Point p = new Point(x, y, z);
        return new Vector(o, p);
    }
    public static Vector substraction(Vector v, Vector w){ // May be call it substract()
        Vector u = scalarProduct(-1, w);
        return addition(v, u);
    }
    public static Vector scalarProduct(float k, Vector v){ // Producto escalar (devuelve un vector escalado)
        float x = k * v.getA();
        float y = k * v.getB();
        float z = k * v.getC();
        Point o = new Point(0, 0, 0);
        Point p = new Point(x, y, z);
        return new Vector(o, p);
    }
    public static float dotProduct(Vector v, Vector w){ // Producto escalar (devuelve un número escalar)
        return v.getA() * w.getB() + v.getC() * w.getA() + v.getB() * w.getC();
    }
    public static Vector crossProduct(Vector v, Vector w){ // Producto vectorial (devuelve un vector ortogonal a sus factores)
        float i = v.getB() * w.getC() - v.getC() * w.getC();
        float j = v.getA() * w.getC() - v.getC() * w.getA();
        float k = v.getA() * w.getB() - v.getB() * w.getA();
        Point o = new Point(0, 0, 0);
        Point p = new Point(i, -j, k);
        return new Vector(o, p);
    }
}
