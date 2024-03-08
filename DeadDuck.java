public class DeadDuck extends Duck {

    // java doesn't allow multiple inheritance
    public DeadDuck() {
        // Set behaviors for a DeadDuck object
        quackBehaviour = new Mute(); // we are calling the class Quack, where the behavoiur is quack
        flyBehaviour = new FlyNoWay();
        swimBehaviour = new DrownWater();
    }

    @Override
    void display() {
        System.out.println("This is Dead Duck ><");
    }
}
