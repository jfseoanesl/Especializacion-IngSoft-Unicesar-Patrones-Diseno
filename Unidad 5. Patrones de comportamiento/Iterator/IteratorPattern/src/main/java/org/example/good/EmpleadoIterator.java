package org.example.good;

public class EmpleadoIterator implements Iterator {
    private Empresa empresa;
    private int currentIndex = 0;

    public EmpleadoIterator(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < empresa.getSize();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return empresa.getEmpleadoAt(currentIndex++);
        }
        return null;
    }
}
