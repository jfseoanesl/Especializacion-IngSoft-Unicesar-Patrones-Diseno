public class Farmacia extends ProcesamientoArchivos{


    @Override
    protected void cargarArchivo() {
        System.out.println("Cargando datos de la farmacia...");
    }

    @Override
    protected void procesarDatos() {
        System.out.println("Procesando datos de la farmacia...");
    }
}
