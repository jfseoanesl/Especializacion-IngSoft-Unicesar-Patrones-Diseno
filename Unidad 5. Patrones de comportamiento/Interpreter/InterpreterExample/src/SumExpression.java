public class SumExpression implements Expression {
    private Expression left;
    private Expression right;

    public SumExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double interpret() {
        return left.interpret() + right.interpret();
    }
}
