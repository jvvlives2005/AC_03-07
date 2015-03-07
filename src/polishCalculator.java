/** Polish Calculator
 * with Anthony F
 * Created by c4q-joshelynvivas on 3/7/15.
 */
import java.util.Scanner;

public class polishCalculator {
    public static void main(String[] args){
        double firstNum;
        double secondNum;
        double answer;
        String operator;

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your first number:");
        firstNum = input.nextDouble();

        System.out.println("Please enter your second number:");
        secondNum = input.nextDouble();

        System.out.println("Please enter an operation:");
        operator = input.next();

        if (operator.equals("+")){
            answer = firstNum + secondNum;
            System.out.println("Result: " + answer);
        }

        if (operator.equals("-")){
            answer = firstNum - secondNum;
            System.out.println("Result: " + answer);
        }

        if (operator.equals("*")){
            answer = firstNum * secondNum;
            System.out.println("Result: " + answer);
        }
        if (operator.equals("/")){
            answer = firstNum / secondNum;
            System.out.println("Result: " + answer);
        }
        if (operator.equals("%")){
            answer = firstNum % secondNum;
            System.out.println("Result: " + answer);
        }

    }
}
