package Polimorfism;
 public abstract class Participant {
    private String Name;
    private int MaxRunDistance;
    private int MaxJumpHeight;

    public  Participant(String Name, int MaxRunDistance, int MaxJumpHeight) {
        this.MaxRunDistance = MaxRunDistance;
        this.MaxJumpHeight = MaxJumpHeight;
        this.Name = Name;
    }

     public abstract void run();
     public abstract  void jump();

     public int getMaxRunDistance() {
         return MaxRunDistance;
     }

     public int getMaxJumpHeight() {
         return MaxJumpHeight;
     }

     public String getName() {
         return Name;
     }
 }


