import java.util.ArrayList;
import java.util.Scanner;

class myClass{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> operandList = new ArrayList<>();
        operandList.add("Rogerio");

        System.out.println("Simple Calculator");

        System.out.println("Insert the operator: ");
        char operand = scanner.next().charAt(0);


        System.out.println("Please, insert a number: ");
        double num1 = scanner.nextInt();

        System.out.println("Please, insert another number: ");
        double num2 = scanner.nextInt();

        double result = 0;

        switch (operand){
            case '*':
                result =  num1 * num2;
                break;
            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                }else{
                    System.out.println("Error. You can't do a division by zero.")
                }
                break;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            default:
                System.out.println("The operand is not correct!");
                break;
        }

        System.out.println("The final result is " + result);
    }
            }