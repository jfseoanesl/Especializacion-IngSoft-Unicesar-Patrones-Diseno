package ejemploHerencia;

public class EmpleadoAsalariado extends Empleado {
    private int horasLaboradas;
    private double pagoPorHora;

    public EmpleadoAsalariado(String nombre, String cargo, int horas, int pago) {
        super(nombre, cargo);
        this.horasLaboradas=horas;
        this.pagoPorHora=pago;
    }


    public int getHorasLaboradas() {
        return horasLaboradas;
    }

    public void setHorasLaboradas(int horasLaboradas) {
        this.horasLaboradas = horasLaboradas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public double calcularSalario(){

        return this.horasLaboradas * this.pagoPorHora;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "horasLaboradas=" + horasLaboradas +
                ", pagoPorHora=" + pagoPorHora +
                '}';
    }
}
