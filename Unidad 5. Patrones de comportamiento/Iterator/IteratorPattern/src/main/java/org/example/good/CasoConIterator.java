package org.example.good;

public class CasoConIterator {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(new Empleado("Juan", 3000));
        empresa.agregarEmpleado(new Empleado("Maria", 3500));
        empresa.agregarEmpleado(new Empleado("Pedro", 4000));

        Iterator iterator = empresa.createIterator();
        double salarioTotal = 0;
        while (iterator.hasNext()) {
            Empleado empleado = (Empleado) iterator.next();
            salarioTotal += empleado.getSalario();
        }
        System.out.println("Salario total de la empresa: " + salarioTotal);
    }
}
