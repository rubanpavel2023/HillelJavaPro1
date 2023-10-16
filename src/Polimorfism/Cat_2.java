package Polimorfism;
public class Cat_2 extends Participant {
    public Cat_2(String Name, int MaxRunDistance, int MaxJumpHeight) {
        super(Name, MaxRunDistance, MaxJumpHeight);
    }
    public  void run(){
        System.out.println(getName()+"Run! ");
    };
    public  void jump(){
        System.out.println(getName()+"Jump! ");
    };
}


