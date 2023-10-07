public class Animals {
    private static int TotalAnimalCount = 0;
    String Name;
    int maxRunDistance;
    int maxSwimDistance;

    public Animals(String NewName, int maxRunDistance, int maxSwimDistance, int TotalAnimalCount) {
        this.Name = NewName;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.TotalAnimalCount++;
    }

    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println(new StringBuilder(Name).append(" don't run > ").append(maxRunDistance).append(" m").toString());
        } else {
            System.out.println(new StringBuilder(Name).append(" run ").append(distance).append( " m").toString());
        }
    }

    public void swim(int distance) {
        if (distance > maxSwimDistance) {
            System.out.println(new StringBuilder(Name).append(" don't swim > ").append(maxSwimDistance).append(" m").toString());
        } else {
            System.out.println(new StringBuilder(Name).append(" swim ").append(distance).append( " m").toString());
        }
    }

    public static int getTotalAnimalCount() {
        return TotalAnimalCount;
    }
}


