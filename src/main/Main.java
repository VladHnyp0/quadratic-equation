package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        double a, b, c;
        double x1, x2;

        System.out.print("Type a: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        if (a == 0) {
            System.out.println("Немає коренів.\na не може дорівнювати 0!");
            System.exit(0);
        }
        System.out.print("Type b: ");
        b = scanner.nextDouble();
        System.out.print("Type c: ");
        c = scanner.nextDouble();

        double D = b * b - 4 * a * c;


        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.format("x1 = " + x1 + "\nx2 = " + x2);
        }
        else if (D == 0) {
            double x = -b / (2 * a);
            System.out.format("x = " + x);
        }
        else {
            System.out.println("Рівняння немає дійсних коренів");
        }



    }
}
