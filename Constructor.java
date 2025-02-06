class Constructor
{
int a,b;
Constructor()
{
a=12;
b=3;
}
public void display()
{
 System.out.println("a value is:"+a+ "b value is:" +b);
}
public static void main(String args[])
{
Constructor obj1 = new Constructor();
obj1.display();
Constructor obj2 = new Constructor();
obj2.display();
}
}

output:

D:\javapractice>javac Constructor.java

D:\javapractice>java Constructor
a value is:12b value is:3
a value is:12b value is:3