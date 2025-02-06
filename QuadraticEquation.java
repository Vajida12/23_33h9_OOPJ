import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for coefficients
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        // Display the discriminant
        System.out.println("Discriminant (D) = " + discriminant);

        // Determine the nature of the roots
        if (discriminant > 0) {
            System.out.println("The equation has two distinct real roots.");
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            System.out.println("The equation has one real root (a repeated root).");
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("The equation has two complex roots.");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

        scanner.close();
    }
}

output:
Microsoft Windows [Version 10.0.19045.5247]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Windows>d:

D:\>cd javapractice

D:\javapractice>javac QuadraticEquation.java

D:\javapractice>java QuadraticEquation
Enter coefficient a: 2
Enter coefficient b: 4
Enter coefficient c: 5
Discriminant (D) = -24.0
The equation has two complex roots.
Root 1: -1.0 + 1.224744871391589i
Root 2: -1.0 - 1.224744871391589i

