package July8;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;


public class PracticeScannerClass {

    public static void main(String[] args) {

        System.out.println("Welcome to my Calculator");

        Scanner operations = new Scanner(System.in);


        Scanner value = new Scanner(System.in);

      //  int x;
        System.out.println("Enter the value of x: ");
        int x = value.nextInt();
        System.out.println("X = " + x);

        System.out.println("Enter the value of y2: ");
        int y = value.nextInt();
        System.out.println("Y = " +y);
        int Operation1 = x + y;

        Scanner Addition = new Scanner(System.in);

        System.out.println("The Answer is: ");
        System.out.println(Operation1);

    }


}
