import java.util.Scanner;

public class Calc {
    private double num1;
    private double num2;

    public Calc() {
        this.num1 = 0.0;
        this.num2 = 0.0;
    }

    // setter for num1
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    //Setter for num2
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    //Getter for num1
    public double getNum1() {
        return this.num1;
    }

    //Getter for num2
    public double getNum2(){
        return this.num2;
    }

    //Calculations
    public double add() {
        return this.num1 + this.num2;
    }

    public double subtract() {
        return this.num1 - this.num2;
    }

    public double multiply() {
        return this.num1 * this.num2;
    }

    public double divide() {
        return this.num1 / this.num2;
    }

    // Display public data field

    @Override
    public String toString() {
        return "Displaying private data fields using toString():\nNum1: " + this.num1 + "\nNum2: " + this.num2;
    }

}