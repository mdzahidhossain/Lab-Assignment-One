import java.awt.geom.Point2D;

public class Question4SolutionTriangle {

    private double x1, x2, x3, y1, y2, y3;
    private Point2D.Double a;
    private Point2D.Double b;
    private Point2D.Double c;

    public Question4SolutionTriangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {

        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;

        a = new Point2D.Double(x1, y1);
        b = new Point2D.Double(x2, y2);
        c = new Point2D.Double(x3, y3);
    }

    public double getPerimeter()
    {
        double line1 = a.distance(b);
        double line2 = a.distance(c);
        double line3 = b.distance(c);

        double perimeter = line1 + line2 + line3;
        return perimeter;
    }


    public double getALength()
    {
        double length = a.distance(b);
        return length;
    }

    public double getBLength()
    {
        double length = b.distance(c);
        return length;
    }

    public double getCLength()
    {
        double length = c.distance(a);
        return length;
    }


    public double getArea()
    {
        double area;
        area = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2);
        return area;
    }

    public double getAngleA()
    {
        double angle = (Math.pow(getCLength(), 2) + Math.pow(getALength(), 2) - Math.pow(getBLength(), 2)) /
                (2 * getCLength() * getALength());
        angle = Math.acos(angle);
        return angle;
    }

    public double getAngleB()
    {
        double angle = (Math.pow(getBLength(), 2) + Math.pow(getCLength(), 2) - Math.pow(getALength(), 2)) /
                (2 * getBLength() * getCLength());
        angle = Math.acos(angle);
        return angle;
    }

    public double getAngleC()
    {
        double angle = (Math.pow(getALength(), 2) + Math.pow(getBLength(), 2) - Math.pow(getCLength(), 2)) /
                (2 * getALength() * getBLength());
        angle = Math.acos(angle);
        return angle;
    }
}