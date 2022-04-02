/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

/**
 *
 * @author gian_
 */
public class Operations {
    
    public String Operation(String firstNumber, String secondNumber, String operator) {
        switch(operator){
            case "+": {
                return this.Soma(firstNumber,secondNumber);
            }
            case "-": {
                return this.Sub(firstNumber, secondNumber);
            }
            case "x": {
                return this.Mult(firstNumber, secondNumber);
            }
            case "/": {
                return this.Div(firstNumber, secondNumber);
            }
            default: {
                return "";
            }
        }
    }
    
    public String Soma(String firstNumber, String secondNumber) {
        return Double.toString(Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber));
    }
    
    public String Sub(String firstNumber, String secondNumber) {
        return Double.toString(Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber));
    }
    
    public String Mult(String firstNumber, String secondNumber) {
        return Double.toString(Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber));
    }
    
    public String Div(String firstNumber, String secondNumber) {
        if (secondNumber == "0") {
            return "Error";
        }
        return Double.toString(Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber));
    }
    
}
