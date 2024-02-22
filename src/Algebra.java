public class Algebra {
    private Algebra(){
        // Functionalities needed:
        // Determine if a pair of lines are parallel/perpendicular/orthogonal/skewed
        // If exists find an intersection between two objects
        // Calculate projection of an object to another
        // Calculate distance between two objects
        //
        // Decide if the following functionalities will be added to this class (Algebra) or to another class specialized for rendering tasks
        // Z axis shrinking effect
        // Z axis dimming
        // Visibility rendering order (no object clipping)
        // Time dimension rendering

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static class Distance {
        private Distance(){
            System.out.println("Stop it, get some help.");
        }
        public static void calculateDistance(Point p, Point q){
            float deltaX = p.getX() - q.getX();
            float deltaY = p.getY() - q.getY();
            float deltaZ = p.getZ() - q.getZ();

            float distance = (float) Math.sqrt(deltaX + deltaY + deltaZ);
        }
        public static void calculateDistance(Point p, Line a){
            calculateDistance(p, a.getPoint());
        }
        public static void calculateDistance(Line a, Line b){

        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
