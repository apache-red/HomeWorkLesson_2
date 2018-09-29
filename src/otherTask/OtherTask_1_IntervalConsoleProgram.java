package otherTask;

import java.util.Scanner;

public class OtherTask_1_IntervalConsoleProgram {

    boolean indicatorMenu = true;
    private int[] mass = new int[3];
    public void start(){
        showMainMenu();
    }
// show menu
    private void showMainMenu(){
        System.out.println("Select an action. Enter the number 1...5.");
        System.out.println("1. Set k intervals (n, m]");
        System.out.println("2. Set k intervals [n, m)");
        System.out.println("3. Set k intervals (n, m)");
        System.out.println("4. Set k intervals [n, m]");
        System.out.println("5. Stop program");
        writeAction();
    }

    private void writeAction(){
        System.out.println("--------------------------");
        System.out.print("Input field: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        validTest(str, indicatorMenu);
    }

    private void choseAction(int number){
        indicatorMenu = false;
        switch(number) {
            case 1:
                System.out.println("Enter: number K N M");
                writeAction();
                setInterval_1();
                break;
            case 2:
                System.out.println("Enter: number K N M");
                writeAction();
                setInterval_2();
                break;
            case 3:
                System.out.println("Enter: number K N M");
                writeAction();
                setInterval_3();
                break;
            case 4:
                System.out.println("Enter: number K N M");
                writeAction();
                setInterval_4();
                break;
            case 5:
                System.out.println("Program was stopped");
                System.exit(0);
           }
    }

    private int parsingString(String str){
        int number = Integer.parseInt(str);
        return number;
    }

    private  int[] splitString(String str){
    int iterator = 0;
        for (String retval : str.split(" ", 3)) {
           mass[iterator] = Integer.parseInt(retval);
            iterator ++;
        }
        return mass;
    }

    private void validTest(String str, boolean indicatorMenu){
        if (indicatorMenu == true) {
            if (str.trim().isEmpty() != true && str.matches("\\b[0-9]{1,}") == true) {
                int number = parsingString(str);
                if (number <= 5 && number > 0) {
                    choseAction(number);
                } else {
                    System.out.println("--------------------------");
                    System.out.println("!Exeption! Enter a number between 1 and 5");
                    writeAction();
                }
            } else {
                System.out.println("--------------------------");
                System.out.println("!Exeption! Enter a number between 1 and 5");
                writeAction();
            }
        }
        if (indicatorMenu == false) {
            if (str.trim().isEmpty() != true && str.matches("\\b[0-9]+ [0-9]+ [0-9]{1,}") == true) {
                      splitString(str);
            } else {
            System.out.println("--------------------------");
            System.out.println("!Exeption! Enter number");
            writeAction();
        }
        }
        }

        private void setInterval_1(){
            indicatorMenu = true;
        if ((mass[0] > mass[1] && mass[0]<= mass[2]) || mass[0] == mass[2]){
            System.out.println("-----------------------------------------");
            System.out.println("The intervals ("+mass[1]+", "+mass[2]+"] contains number "+ mass[0]);
            System.out.println("-----------------------------------------");
            showMainMenu();
        }
        else {
            System.out.println("-----------------------------------------");
            System.out.println("The intervals ("+mass[1]+", "+mass[2]+"] DOES NOT contains number "+ mass[0]);
            System.out.println("-----------------------------------------");
            showMainMenu();
        }
    }

    private void setInterval_2() {
        indicatorMenu = true;
        if ((mass[0] >= mass[1] && mass[0]< mass[2]) || mass[0] == mass[1]){
            System.out.println("-----------------------------------------");
            System.out.println("The intervals ["+mass[1]+", "+mass[2]+")contains number "+ mass[0]);
            System.out.println("-----------------------------------------");
            showMainMenu();
        }
        else {
            System.out.println("-----------------------------------------");
            System.out.println("The intervals ["+mass[1]+", "+mass[2]+") DOES NOT contains number "+ mass[0]);
            System.out.println("-----------------------------------------");
            showMainMenu();
        }
    }
    private void setInterval_3() {
        indicatorMenu = true;
        if (mass[0] > mass[1] && mass[0]< mass[2]){
            System.out.println("-----------------------------------------");
            System.out.println("The intervals ("+mass[1]+", "+mass[2]+") contains number "+ mass[0]);
            System.out.println("-----------------------------------------");
            showMainMenu();
        }
        else {
            System.out.println("-----------------------------------------");
            System.out.println("The intervals ("+mass[1]+", "+mass[2]+") DOES NOT contains number "+ mass[0]);
            System.out.println("-----------------------------------------");
            showMainMenu();
        }
    }
    private void setInterval_4() {
        indicatorMenu = true;
        if ((mass[0] >= mass[1] && mass[0]<= mass[2]) || mass[0] == mass[2] || mass[0] == mass[1]){
            System.out.println("-----------------------------------------");
            System.out.println("The intervals ["+mass[1]+", "+mass[2]+"]contains number "+ mass[0]);
            System.out.println("-----------------------------------------");
            showMainMenu();
        }
        else {
            System.out.println("-----------------------------------------");
            System.out.println("The intervals ["+mass[1]+", "+mass[2]+"] DOES NOT contains number "+ mass[0]);
            System.out.println("-----------------------------------------");
            showMainMenu();
        }
    }
}
