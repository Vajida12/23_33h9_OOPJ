import java.util.Scanner;
class BubbleSort
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of elements in the array");
int n=sc.nextInt();
int[]ar=new int[n];
System.out.println("enter the elements into the array");
int j;
for(int i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
for(int i=0;i<n-1;i++)
{
for(j=0;j<n-i-1;j++)
{
if(ar[j]>ar[j+1])
{
 int temp=ar[j];
 ar[j]=ar[j+1];
ar[j+1]=temp;
}
}
}
System.out.println("sorted array");
for(int i=0;i<n;i++)
{
System.out.println(ar[i]);
}
}
} 

output:
D:\javapractice>javac BubbleSort.java

D:\javapractice>java BubbleSort
enter the number of elements in the array
4
enter the elements into the array
14
8
20
1
sorted array
1
8
14
20