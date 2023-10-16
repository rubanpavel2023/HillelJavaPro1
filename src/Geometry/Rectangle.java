package Geometry;

public class Rectangle implements GeometricFigure {
   static double Side_lenght;
    static double Side_widht;
    private static double AreaRectangleRes;

    public Rectangle(double side_lenght, double side_widht) {
        Side_lenght = side_lenght;
        Side_widht = side_widht;
    }
    public static double getAreaGeometricFigure() {
        AreaRectangleRes = Side_lenght*Side_widht;
        return AreaRectangleRes;
    }

    public static double getAreaRectangleRes() {
        return AreaRectangleRes;
    }
}
