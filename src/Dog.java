public class Dog extends Animals{
    private static int DogCount = 0;
    public Dog(String Name) {
        super(Name, 500, 10, 0);
        this.DogCount++;
    }

    public static int getDogCount() {
        return DogCount;
    }
}
