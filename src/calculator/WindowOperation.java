package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WindowOperation {

    Operations operations = new Operations();

    public void start(){
        showMenu();
        choseAction(writeAction());
    }

    private void showMenu(){
        System.out.println("--------------------------");
        System.out.println("Select an action. Enter the number 1...5.");
        System.out.println("1. Addition(a + b)");
        System.out.println("2. Subtraction (a - b)");
        System.out.println("3. Multiplication (a * b)");
        System.out.println("4. Division (a / b)");
        System.out.println("5. Stop program");
        System.out.println("--------------------------");
    }

    private int writeAction(){
        System.out.print("Input field: ");
        Scanner scanner = new Scanner(System.in);
        int number = 5;
        try {
            number = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("!Exeption! Enter a number");
            writeAction();
        }
        return number;
    }

    private void choseAction(int number){
        switch(number) {
            case 1:
                System.out.println("Enter number A + B");
                System.out.println("--------------------------");
                System.out.println(operations.addition(writeAction(), writeAction()));
                break;
            case 2:
                System.out.println("Enter number A - B");
                System.out.println("--------------------------");
                System.out.println(operations.subtraction(writeAction(), writeAction()));
                break;
            case 3:
                System.out.println("Enter number A * B");
                System.out.println("--------------------------");
                System.out.println(operations.multiplication(writeAction(), writeAction()));
                break;
            case 4:
                System.out.println("Enter number A / B");
                System.out.println("--------------------------");
                System.out.println(operations.division(writeAction(), writeAction()));
                break;
            case 5:
                System.out.println("Program was stopped");
                System.exit(0);
        }
        start();
    }

}
