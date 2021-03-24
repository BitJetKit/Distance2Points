package distance2Points;
/**
 * @author: Bit Jet Kit
 * Title: Distance
 * Date: March 24, 2021
 * Purpose: Find the distance between two points.
 */
public class Distance {
    // Declare the fields.
    private double x_1 = 0.0;
    private double y_1 = 0.0;
    private double x_2 = 0.0;
    private double y_2 = 0.0;
    private double distance = 0.0;
    public double getPoint1X(){
        return x_1;
    }
    public void setPoint1X(double x) {
        this.x_1 = x;
    }
    public double getPoint1Y(){
        return y_1;
    }
    public void setPoint1Y(double y) {
        this.y_1 = y;
    }
    public double getPoint2X(){
        return x_2;
    }
    public void setPoint2X(double x) {
        this.x_2 = x;
    }
    public double getPoint2Y(){
        return y_2;
    }
    public void setPoint2Y(double y){
        this.y_2 = y;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double x_1, double y_1, double x_2, double y_2) {
        distance = Math.sqrt(Math.pow(x_2 - x_1, 2) + Math.pow(y_2 - y_1, 2));
    }
    public void printDistance(){
        System.out.println("Between the points, (" + x_1 + ", " + y_1 + ") and (" + x_2 + ", " + y_2 + "), the distance is " + distance);
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(distance);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(x_1);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(x_2);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y_1);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y_2);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Distance other = (Distance) obj;
        if (Double.doubleToLongBits(distance) != Double.doubleToLongBits(other.distance))
            return false;
        if (Double.doubleToLongBits(x_1) != Double.doubleToLongBits(other.x_1))
            return false;
        if (Double.doubleToLongBits(x_2) != Double.doubleToLongBits(other.x_2))
            return false;
        if (Double.doubleToLongBits(y_1) != Double.doubleToLongBits(other.y_1))
            return false;
        if (Double.doubleToLongBits(y_2) != Double.doubleToLongBits(other.y_2))
            return false;
        return true;
    }
}
