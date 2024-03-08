public class DecoyDuck extends Duck {
    // java doesn't allow multiple inheritance
    public DecoyDuck() {
        // Set behaviors for a DecoyDuck object
        quackBehaviour = new Mute(); // we are calling the class Quack, where the behavoiur is quack
        flyBehaviour = new FlyNoWay();
        swimBehaviour = new FloatWater();
    }

    @Override
    void display() {
        System.out.println("This is Decoy Duck ><");
    }

}
