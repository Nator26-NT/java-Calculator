
import java.util.Scanner;



public class Nator {
public static void main(String[] args) {
    System.out.println("Num1: ");
    Scanner NUM1 = new Scanner(System.in);
    double Num1 = NUM1.nextDouble();

    System.out.println("1 for + | 2 for - | 3 for / | 4 for *");
    Scanner OP = new Scanner(System.in);
    int op = OP.nextInt();

    System.out.println("Num1: ");
    Scanner NUM2 = new Scanner(System.in);
    double Num2 = NUM2.nextDouble();



    if (op == 1) {
        System.out.println(Num1 + Num2);
    }
    else if (op == 2){
        System.out.println(Num1 - Num2);
    }
    else if (op == 3) {
        System.out.println(Num1 / Num2);
    }
    else if (op == 4) {
        System.out.println(Num1 * Num2);
    }


    // System.out.println("Operator: ");
    // Scanner OP = new Scanner(System.in);
    // System.out.println("Num2: ");
    // Scanner NUM2 = new Scanner(System.in);
}
}
