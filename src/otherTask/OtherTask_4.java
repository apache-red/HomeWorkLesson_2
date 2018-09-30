package otherTask;
import java.util.Scanner;

public class OtherTask_4 {

    public void start(){
        showMainMenu();
        writeAction();
    }

    private void showMainMenu(){
        System.out.println("Select an action. To find out the name of the month by number, enter a number from 1 ... 12. To exit type- exit.");
    }

    private void writeAction() {
        System.out.println("--------------------------");
        System.out.print("Input field: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.contains("exit")){
            System.out.println("Program was stopped");
            System.exit(0);
        }
        validTest(str);
    }

    private int parsingString(String str) {
        int number = Integer.parseInt(str);
        return number;
    }

    private void validTest(String str) {
        if (str.trim().isEmpty() != true && str.matches("\\b[0-9]{1,}") == true) {
            int number = parsingString(str);
            if (number <= 12 && number > 0) {
                choseAction(number);
            }else {
                System.out.println("--------------------------");
                System.out.println("!Exeption! Enter a number between 1 and 12");
                writeAction();
            }
        } else{
            System.out.println("--------------------------");
            System.out.println("!Exeption! Enter a number between 1 and 12");
            writeAction();
        }

    }

    private void choseAction (int number){
        switch(number) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        showMainMenu();
        writeAction();
    }

}

