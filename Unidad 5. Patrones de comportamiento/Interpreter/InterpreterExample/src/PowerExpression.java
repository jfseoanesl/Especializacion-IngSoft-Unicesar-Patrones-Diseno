public class PowerExpression implements Expression {
    private Expression base;
    private Expression exponent;

    public PowerExpression(Expression base, Expression exponent) {
        this.base = base;
        this.exponent = exponent;
    }

    @Override
    public double interpret() {
        return Math.pow(base.interpret(), exponent.interpret());
    }
}
