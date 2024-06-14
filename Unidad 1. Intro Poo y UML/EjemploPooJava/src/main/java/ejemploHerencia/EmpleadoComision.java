package ejemploHerencia;

public class EmpleadoComision extends EmpleadoAsalariado {

    private double valorComision;

    public EmpleadoComision(String nombre, String cargo, int horas, int pago, double valorComision) {

        super(nombre, cargo, horas, pago);
        this.valorComision=valorComision;
    }


    public double getValorComision() {
        return valorComision;
    }

    public void setValorComision(double valorComision) {
        this.valorComision = valorComision;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()+this.valorComision;
    }

    @Override
    public String toString() {
        return "EmpleadoComision{" + super.toString()+
                " valorComision=" + this.valorComision +
                " salario="+calcularSalario()+
                "}";
    }
}
