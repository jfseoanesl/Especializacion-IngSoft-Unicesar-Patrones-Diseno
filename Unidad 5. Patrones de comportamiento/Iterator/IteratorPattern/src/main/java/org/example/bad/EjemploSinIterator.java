package org.example.bad;

public class EjemploSinIterator {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(new Empleado("Juan", 3000));
        empresa.agregarEmpleado(new Empleado("Maria", 3500));
        empresa.agregarEmpleado(new Empleado("Pedro", 4000));

        double salarioTotal = 0;
        for (Empleado empleado : empresa.getEmpleados()) {
            salarioTotal += empleado.getSalario();
        }
        System.out.println("Salario total de la empresa: " + salarioTotal);
    }
}
