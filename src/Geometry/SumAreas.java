package Geometry;

public class SumAreas {
    public static double sumAreasFigures (){
        Circle.getAreaGeometricFigure();
        Triangle.getAreaGeometricFigure();
        Rectangle.getAreaGeometricFigure();
        double Res = Circle.getAreaCircleRes()+Triangle.getAreaTriangleRes()+Rectangle.getAreaRectangleRes();
        System.out.println(new StringBuilder("Sum of areas of figures (m2): ").append(Res).toString());
        return Res;
    }
}
