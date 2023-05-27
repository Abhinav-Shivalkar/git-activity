import java.io.*;
import java.util.Scanner;
class activity2{

public static void main(String[] args) {
 System.out.println("Enter 2 numbers");
 Scanner s = new Scanner(System.in);
 int a = s.nextInt();
 int b = s.nextInt();
 int c = a+b;
 System.out.println("The sum is : "+c);
}
}