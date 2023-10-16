package Geometry;

public class Triangle implements GeometricFigure {
    static double Side_A;
    static double Side_B;
    static double Side_C;
    private static double AreaTriangleRes;


    public Triangle(double side_A, double side_B, double side_C) {
        Side_A = side_A;
        Side_B = side_B;
        Side_C = side_C;
    }
    public static double getAreaGeometricFigure() {
        double a = (Side_A+Side_B+Side_C)/2;
        AreaTriangleRes = Math.abs(a*(a-Side_A)*(a-Side_B)*(a-Side_C));//Heron's formula
        return AreaTriangleRes;
    }

    public static double getAreaTriangleRes() {
        return AreaTriangleRes;
    }
}
