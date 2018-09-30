package otherTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OtherTask_3 {

    public void start(){
        showMainMenu();
        writeAction();
    }

    private void writeAction(){
        int indicate = 1;
        System.out.println("--------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        try {
       double a = scanner.nextDouble();
        validTest(a,indicate);
        indicate++;
        System.out.print("Enter B: ");
       double b = scanner.nextDouble();
       validTest(b, indicate);
       indicate++;
        System.out.print("Enter C: ");
       double c = scanner.nextDouble();
       validTest(c, indicate);
       solution(a,b,c);
        }
        catch (InputMismatchException e){
            System.out.println("Exeption! You must enter only numbers");
            writeAction();
        }
    }

    private void validTest(double number, int indicate){
        if (number == 0.0 && indicate ==1){
            System.out.println("Exeption! A can not be 0");
            writeAction();
        }
    }

    private void showMainMenu(){
        System.out.println("This program solves a quadratic equation of the form:");
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Enter A, B  and C:");
    }

    private void solution(double a, double b, double c) {
        double d, x, x1, x2;
        d = (b * b) - (4 * a * c);
        if (d < 0) {
            System.out.println("The equation has no roots!");
        }
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2*a);
            x2 = (-b - Math.sqrt(d))/ (2*a);
            System.out.println("This equation has several roots: x1 = " + x1 + "and x2 = " + x2);
        }
        if (d == 0) {
            x = -b / (2 * a);
            System.out.println("The equation has one root: x = " + x);
        }
    }
}
