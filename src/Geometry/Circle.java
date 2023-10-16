package Geometry;

public class Circle implements GeometricFigure {
    private static double Radius;
    private static double AreaCircleRes;

    public Circle(double radius) {
        this.Radius = radius;
    }
    public static double getAreaGeometricFigure() {
        AreaCircleRes = Math.PI*Radius*Radius;
        return AreaCircleRes;
    }

    public static double getAreaCircleRes() {
        return AreaCircleRes;
    }
}
