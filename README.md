# Strategy_Pattern

This repository contains a Java program that simulates different behaviors of various types of ducks. It includes implementations of different types of ducks such as RedHeadDuck, RubberDuck, DecoyDuck, MallardDuck, and DeadDuck.

## Duck Types
* RedHeadDuck: Represents a duck with a red head. It demonstrates standard duck behavior.
* RubberDuck: Represents a rubber duck, which typically doesn't fly or quack like real ducks but can swim.
* DecoyDuck: Represents a decoy duck, which is typically used for hunting and doesn't exhibit typical duck behavior.
* MallardDuck: Represents a mallard duck, a common type of duck found in the wild, exhibiting standard duck behavior.
* DeadDuck: Represents a dead duck, which doesn't exhibit any behaviors as it's, well, dead.

## Interfaces
  * **FlyBehaviour**
    The FlyBehaviour interface defines a method fly() that represents the flying behavior of ducks. Different duck species may implement this interface differently to exhibit varying flying behaviors.
    
    1. FlyWithWings: Implements FlyBehaviour, representing a duck that flies with its wings.
    2. FlyNoWay: Implements FlyBehaviour, representing a duck that cannot fly.
    
  * **QuackBehaviour**
    The QuackBehaviour interface defines a method quack() that represents the quacking behavior of ducks. Ducks can have different types of quacking sounds, and this interface allows for flexibility in defining quacking behavior.
    
    1. Quack: Implements QuackBehaviour, representing a duck that quacks.
    2. Squeak: Implements QuackBehaviour, representing a duck that only squeaks.
    3. Mute: Implements QuackBehaviour, representing a duck that is mute and cannot quack.

  * **SwimBehaviour**
   The SwimBehaviour interface defines a method swim() that represents the swimming behavior of ducks. While most ducks are natural swimmers, some may have unique swimming styles or limitations.
   
   1. SwimWater: Implements SwimBehaviour, representing a duck that swims in water.
   2. FloatWater: Implements SwimBehaviour, representing a duck that floats on water.
   3. DrownWater: Implements SwimBehaviour, representing a duck that drowns in water.

## Classes
* Main.java: Contains the main method to demonstrate duck behaviors.
* Duck.java: A superclass representing common behaviors and properties of ducks.
* RedHeadDuck.java: Subclass of Duck, representing a red-headed duck.
* RubberDuck.java: Subclass of Duck, representing a rubber duck.
* DecoyDuck.java: Subclass of Duck, representing a decoy duck.
* MallardDuck.java: Subclass of Duck, representing a mallard duck.
* DeadDuck.java: Subclass of Duck, representing a dead duck.

See the diagram explaining the working and the connections of the program below:
![Strategy_Pattern_final](https://github.com/RichaGupta1901/Strategy_Pattern/assets/114852296/fce2298f-e93d-4925-a092-4cb7451eef2a)
