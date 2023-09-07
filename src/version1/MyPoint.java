package version1;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        this(0, 0);
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(MyPoint point) {
        double deltaX = this.x - point.x;
        double deltaY = this.y - point.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    
    public double getDistance() {
        return getDistance(new MyPoint(0, 0));
    }

    public void displayPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int getQuadrant() {
        if (x == 0 && y == 0) {
            return 5;
        } else if (x == 0) {
            return 6;
        } else if (y == 0) {
            return 5;
        } else if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    public double getAngle() {
        if (x == 0 && y == 0) {
            return 0;
        } else if (x == 0) {
            if (y > 0) {
                return 90;
            } else {
                return 270;
            }
        } else {
            double angle = Math.toDegrees(Math.atan2(y, x));
            if (angle < 0) {
                angle += 360;
            }
            return angle;
        }
    }
}
