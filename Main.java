public class Main {
    public static void main(String[] args) {
        // Creating a RedHeadDuck object and demonstrating its behavior
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.performSwim();

        System.out.println("------------------");
        // Creating a RubberDuck object and demonstrating its behavior
        RubberDuck rb = new RubberDuck();
        rb.display();
        rb.performFly();
        rb.performQuack();
        rb.performSwim();

        System.out.println("------------------");
        // Creating a DecoyDuck object and demonstrating its behavior
        DecoyDuck dd = new DecoyDuck();
        dd.display();
        dd.performFly();
        dd.performQuack();
        dd.performSwim();

        System.out.println("------------------");
        // Creating a MallardDuck object and demonstrating its behavior
        MallardDuck md = new MallardDuck();
        md.display();
        md.performFly();
        md.performQuack();
        md.performSwim();

        System.out.println("------------------");
        // Creating a DeadDuck object and demonstrating its behavior
        DeadDuck deDuck = new DeadDuck();
        deDuck.display();
        deDuck.performFly();
        deDuck.performQuack();
        deDuck.performSwim();

    }

}
