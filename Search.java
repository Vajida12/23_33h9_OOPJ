import java.util.Scanner;
class Search
{
  public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of elements in the array:");
int n=sc.nextInt();
int[] ar =new int[n];
System.out.println("enter the elements into the array");
for(int i=0;i<n;i++)
{
 ar[i]=sc.nextInt();
}
System.out.println("Enter the key");
int key=sc.nextInt();
int low=0, high=n-1, result=-1;
while(low<=high)
{
int mid=(low+high)/2;
if(ar[mid]==key)
{
result=mid;
break;
}
else if(ar[mid]>key)
{
high=mid-1;
}
else
{
low=mid+1;
}
}
if(result == -1)
{
System.out.println("element not found");
}
else
{
System.out.println("element found at position:"+ result);
}
}
}

output:
D:\javapractice>java Search
enter the number of elements in the array:
5
enter the elements into the array
9
15
45
56
74
Enter the key
56
element found at position:3 