class Vehicle
{
   void start() 
{
  System.out.println("Vehicle is starting");
}
}
class Car extends Vehicle
{
  void drive()
{
  System.out.println("Car is driving");
}
}
public class SingleInheritance
{
 public static void main(String args[])
{
  Car myCar = new Car();
  myCar.start();
  myCar.drive();
}
}

output:
D:\33h9>javac SingleInheritance.java

D:\33h9>java SingleInheritance
Vehicle is starting
Car is driving