public class Distance {
    // Do I really need these constructors? No, because I won't instantiate an object of class Distance... unless I wanted a distance to be an object
    private Distance(){
        System.out.println("Stop it, get some help");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static float calculateDistance(Point p, Point q){
        float deltaX = p.getX() - q.getX();
        float deltaY = p.getY() - q.getY();
        float deltaZ = p.getZ() - q.getZ();

        return (float) Math.sqrt(deltaX + deltaY + deltaZ);
    }
    public static float calculateDistance(Point p, Line l){
        // Line attributes:
        Point q = l.getPoint(); // Random point of the line
        Vector lineDirector = l.getVector();
        float directorNorm = lineDirector.getMagnitude();

        // Starting the calculations
        Vector v = new Vector(p, q); // Vector from far away point to a random point of the line
        Vector w = VectorOperation.crossProduct(v, l.getVector()); // PQ x n <-- (v is the director vector of the line)
        float norm = w.getMagnitude(); // ||PQ x n||
        float distance = norm / directorNorm;
        return distance;
    }
    public static float calculateDistance(Line l, Line m){
        boolean x = true;
        if(x){ // If the lines are parallel
            return calculateDistance(l.getPoint(), m.getPoint());
        }else{ // If not
            return calculateDistance(l.getPoint(), m.getPoint()); // Change this one
        }
    }
    public static void calculateDistance(Point p, Plane pi){

    }
}
