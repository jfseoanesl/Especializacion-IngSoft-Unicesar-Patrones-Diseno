package org.example.good;

import java.util.ArrayList;
import java.util.List;

public class Empresa implements Aggregate {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public Empleado getEmpleadoAt(int index) {
        if (index >= 0 && index < empleados.size()) {
            return empleados.get(index);
        }
        return null;
    }

    public int getSize() {
        return empleados.size();
    }

    @Override
    public Iterator createIterator() {
        return new EmpleadoIterator(this);
    }
}
