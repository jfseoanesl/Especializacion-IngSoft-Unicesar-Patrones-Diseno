package ejemploHerencia;

public class Main {
    public static void main(String[] args) {
        EmpleadoAsalariado empleado = new EmpleadoAsalariado("mane", "actor", 72, 34000);
        imprimirEmpleado(empleado);
        EmpleadoAsalariado ec = new EmpleadoComision("luis", "jugador",50, 2000, 60000);
        imprimirEmpleado(ec);

    }

    public static void imprimirEmpleado(Empleado e){

        System.out.println(e);
    }
}
