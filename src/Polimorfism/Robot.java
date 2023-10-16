package Polimorfism;

public class Robot extends Participant {
    public Robot(String Name, int MaxRunDistance, int MaxJumpHeight) {
        super(Name, MaxRunDistance, MaxJumpHeight);
    }
    public  void run(){
        System.out.println(getName()+"Run!");
    };
    public  void jump(){
        System.out.println(getName()+"Jump! ");
    };
}
