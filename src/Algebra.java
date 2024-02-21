public class Algebra {
    private Algebra(){

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
    /////////////////////////////////////////////
}
