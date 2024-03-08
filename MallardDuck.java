public class MallardDuck extends Duck {

    public MallardDuck() {
        // Set behaviors for a Mallard Duck object
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
        swimBehaviour = new SwimWater();
    }

    @Override
    void display() {
        System.out.println("This is a Mallard Duck ><");
    }
}
