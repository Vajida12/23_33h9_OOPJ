abstract class Shape
{
    abstract void area(); 
}
class Circle extends Shape
{
    int radius;
    
    Circle(int r)
    {
        radius = r;
    }
    
    void area()
    {
        System.out.println("The area of circle is: " + 3.14 * radius * radius);
    }
}

class Rectangle extends Shape
{
    int length, breadth;
    
    Rectangle(int l, int b)
    {
        length = l;
        breadth = b;
    }
    
    void area()
    {
        System.out.println("The area of rectangle is: " + length * breadth);
    }
}

class AE
{
    public static void main(String args[])
    {
        Circle ob1 = new Circle(5);
        ob1.area();  

        Rectangle ob2 = new Rectangle(3, 6);
        ob2.area();  
    }
}
OUTPUT:
D:\33h9>javac AE.java

D:\33h9>java AE
The area of circle is: 78.5
The area of rectangle is: 18

