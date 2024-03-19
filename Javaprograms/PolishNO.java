import java.util.*;
public class PolishNO {
        public static void main(String[] args) {
            String expression = "12 7 3 - / 2 1 5 + * +";
            System.out.println("Result: " + evaluate(expression)); // Output should be 12
        }
    
        public static int evaluate(String expression) {
            Stack<Integer> stack = new Stack<>();
            String[] tokens = expression.split("\\s+");
            
            for (String token : tokens) {
                if (token.matches("-?\\d+")) {
                    stack.push(Integer.parseInt(token));
                } else {
                    int operand2 = stack.pop();
                    int operand1 = stack.pop();
                    switch (token) {
                        case "+":
                            stack.push(operand1 + operand2);
                            break;
                        case "-":
                            stack.push(operand1 - operand2);
                            break;
                        case "*":
                            stack.push(operand1 * operand2);
                            break;
                        case "/":
                            stack.push(operand1 / operand2);
                            break;
                    }
                }
            }
         return stack.pop();
     }
 }
    
