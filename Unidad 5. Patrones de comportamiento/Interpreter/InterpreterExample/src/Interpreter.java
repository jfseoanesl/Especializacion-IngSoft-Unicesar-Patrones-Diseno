import java.util.Stack;


public class Interpreter {
    public double interpret(String expression) {
        Stack<Expression> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            switch (token) {
                case "+":
                    Expression rightSum = stack.pop();
                    Expression leftSum = stack.pop();
                    stack.push(new SumExpression(leftSum, rightSum));
                    break;
                case "-":
                    Expression rightSubtract = stack.pop();
                    Expression leftSubtract = stack.pop();
                    stack.push(new SubtractExpression(leftSubtract, rightSubtract));
                    break;
                case "*":
                    Expression rightMultiply = stack.pop();
                    Expression leftMultiply = stack.pop();
                    stack.push(new MultiplyExpression(leftMultiply, rightMultiply));
                    break;
                case "/":
                    Expression rightDivide = stack.pop();
                    Expression leftDivide = stack.pop();
                    stack.push(new DivideExpression(leftDivide, rightDivide));
                    break;
                case "^":
                    Expression rightPower = stack.pop();
                    Expression leftPower = stack.pop();
                    stack.push(new PowerExpression(rightPower, leftPower));
                    break;
                default:
                    stack.push(new NumberExpression(Double.parseDouble(token)));
                    break;
            }
        }

        return stack.pop().interpret();
    }
}