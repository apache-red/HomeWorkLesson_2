package calculator;

public class Operations {





    public double addition(double a , double b){
        System.out.print("Result "+ a +" + " + b+" = ");
        return  a + b;
    }

    public double subtraction(double a , double b){
        System.out.print("Result "+ a +" - " + b+" = ");
        return a - b;
    }

    public double multiplication(double a , double b){
        System.out.print("Result "+ a +" * " + b+" = ");
        return a * b;
    }

    public double division(double a , double b){
        System.out.print("Result "+ a +" / " + b+" = ");
        return a / b;
    }


    public void stopProgram(){
        System.out.println("Program was stopped");
        System.exit(0);
    }



}
