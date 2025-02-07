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
 System.out.println("Car is being driven");
}
}
class ElectricCar extends Car
{
 void charge()
{
  System.out.println("Electric car is charging");
}
}
 public class Main
{
 public static void main(String args[])
{
 ElectricCar tesla = new ElectricCar();
   tesla.start();
   tesla.drive();
   tesla.charge();
}
}

output:
33h9>javac Main.java

D:\33h9>java Main
Vehicle is starting
Car is being driven
Electric car is charging
