package version1;

public class Geometry {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint();
        
        point1.setPoint(5, 10);
        point2.setPoint(-3, 4);
        
        System.out.print("Point 1: ");
        point1.displayPoint();

        System.out.print("Point 2: ");
        point2.displayPoint();
        
        System.out.println("");
        System.out.println("Testing Methods / Functions");

        System.out.println("Distance between Point 1 and Point 2: " + point1.getDistance(point2));
        System.out.println("Distance between Point 1 and the Origin: " + point1.getDistance());
        
        System.out.println("Quadrant of Point 1: " + point1.getQuadrant());
        System.out.println("Quadrant of Point 2: " + point2.getQuadrant());
        
        System.out.println("Angle of Point 1: " + point1.getAngle());
        System.out.println("Angle of Point 2: " + point2.getAngle());
    }
}
