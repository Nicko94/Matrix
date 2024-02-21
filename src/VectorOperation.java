public class VectorOperation {
    private VectorOperation(){
        System.out.println("Stop it, get some help");
    }
    public static Vector addition(Vector v, Vector w){ // May be call it add()
        float x = v.getX() + w.getX();
        float y = v.getY() + w.getY();
        float z = v.getZ() + w.getZ();
        Point o = new Point(0, 0, 0);
        Point p = new Point(x, y, z);
        return new Vector(o, p);
    }
    public static Vector substraction(Vector v, Vector w){ // May be call it substract()
        Vector u = scalarProduct(-1, w);
        return addition(v, u);
    }
    public static Vector scalarProduct(float k, Vector v){ // Producto escalar (devuelve un vector escalado)
        float x = k * v.getX();
        float y = k * v.getY();
        float z = k * v.getZ();
        Point o = new Point(0, 0, 0);
        Point p = new Point(x, y, z);
        return new Vector(o, p);
    }
    public static float dotProduct(Vector v, Vector w){ // Producto escalar (devuelve un número escalar)
        return v.getX() * w.getX() + v.getY() * w.getY() + v.getZ() * w.getZ();
    }
    public static Vector crossProduct(Vector v, Vector w){ // Producto vectorial (devuelve un vector ortogonal a sus factores)
        float i = v.getY() * w.getZ() - v.getZ() * w.getY();
        float j = v.getX() * w.getZ() - v.getZ() * w.getX();
        float k = v.getX() * w.getY() - v.getY() * w.getX();
        Point o = new Point(0, 0, 0);
        Point p = new Point(i, -j, k);
        return new Vector(o, p);
    }
}
