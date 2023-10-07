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

        System.out.println(new StringBuilder("Total cats: ").append(Cat.getCatCount()).toString());
        System.out.println(new StringBuilder("Total dogs: ").append(Dog.getDogCount()).toString());
        System.out.println(new StringBuilder("Total animals: ").append(Animals.getTotalAnimalCount()).toString());



    }
}
