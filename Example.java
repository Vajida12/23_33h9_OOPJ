class Example
{
 Example()
{
 System.out.println("empty constructor");
}
Example(int a)
{
a = a*a;
System.out.println("a value is:"+a);
}
  Example(int a, int b)
{
   b=a+b;
   System.out.println("a value is:"+a + "b value is:"+a+b);
}
}
class ConstructorOverloading
{
public static void main(String args[])
{
Example obj1 = new Example(7);
Example obj2 = new Example();
Example obj3 = new Example(4,5);
}
}