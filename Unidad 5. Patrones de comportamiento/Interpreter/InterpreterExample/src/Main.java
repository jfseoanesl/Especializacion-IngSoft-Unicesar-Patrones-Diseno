//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        double result = interpreter.interpret("10 2 * 5 / 3 + 4 -");
        System.out.println(result);
        result = interpreter.interpret("2 3 ^ 4 +");
        System.out.println(result);
    }
}