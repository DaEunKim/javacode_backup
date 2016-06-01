package Classhw11;
//****************************************************************
//DogTest.java
//
//A simple test class that creates a Dog and makes it speak.
//       
//****************************************************************


public class DogTest
{
 public static void main(String[] args)
 {
 	Dog dog = new Dog("Spike");
 	Dog dog2 = new Yorkshire("Merce");
 	Dog dog3 = new Labrador("Bob", "Black");
 	
 	System.out.println(dog.getName() + " says " + dog.speak());
 	System.out.println(dog2.getName() + " says " + dog2.speak());
 	System.out.println(dog3.getName() + " says " + dog3.speak());
 	
 	System.out.println(dog2.avgBreedWeight());
 	System.out.println(dog3.avgBreedWeight());
 }
}
