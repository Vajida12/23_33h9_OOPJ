import java.util.Scanner;
class Patient
{
   String name;
   String disease;
   int id;
   void getData()
{
   Scanner sc = new Scanner(System.in);
   System.out.println("enter a name:");
   name=sc.next();
   System.out.println("enter id:");
   id=sc.nextInt();
   System.out.println("enter a disease:");
   disease=sc.next();
}
void display()
{
   System.out.println("Patient details:");
   System.out.println("Name:" +name);
   System.out.println("Id:" +id);
   System.out.println("Disease:" +disease);
}
}
class PatientData
{
 public static void main(String args[])
{
  Patient pt = new Patient();
  pt.getData();
  pt.display();
}
}

output:
D:\javapractice> java PatientData.java
enter a name:
Riya
enter id:
01
enter a disease:
fever
Patient details:
Name:Riya
Id:1
Disease:fever