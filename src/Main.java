import Geometry.Circle;
import Geometry.Rectangle;
import Geometry.SumAreas;
import Geometry.Triangle;
import Polimorfism.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(Class1.greetings());
        Dog Dog1 = new Dog("Bob1");
        Dog Dog2 = new Dog("Bob2");
        Cat Cat1 = new Cat("Mur1");
        Cat Cat2 = new Cat("Mur2");
        new Cat("Mur3");


        Dog1.run(450);
        Dog2.run(120);
        Cat1.run(100);
        Cat2.run(200);
        Dog1.swim(8);
        System.out.println();
        Dog2.swim(15);
        Cat1.swim(1);
        System.out.println();

        System.out.println("Total cats: " + Cat.getCatCount());
        System.out.println("Total dogs: " + Dog.getDogCount());
        System.out.println("Total animals: " + Animals.getTotalAnimalCount());

        System.out.println();
        System.out.println("anagram/nagaram  Anagram? - " + Anagram.checkAnagram("anagram", "nagaram"));
        System.out.println("rat/car Anagram? - " + Anagram.checkAnagram("rat", "car"));

        System.out.println();
//___________________________________________________________________________________________________
       Competition.goOvercome();
//____________________________________________________________________________________________________
        System.out.println();
        new Circle(2.5);
        new Triangle(1.3,1.6,1.0);
        new Rectangle(5.5,8.2);

        SumAreas.sumAreasFigures();

        /*Circle Circle_1 = new Circle(2.5);
        System.out.println
        (new StringBuilder("Area of a circle (m2): ").append(Circle_1.getAreaGeometricFigure()).toString());*/


            }
        }





