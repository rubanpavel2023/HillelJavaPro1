public class Cat extends Animals {
    private static int CatCount = 0;
    public Cat(String Name) {
        super(Name, 200, 0,0);
        this.CatCount++;
    }

    public static int getCatCount() {
        return CatCount;
    }
}

