abstract class ProcesamientoArchivos {

    public final void procesadorArchivos() {
        cargarArchivo();
        procesarDatos();
        guardarLog();
    }

    protected abstract void cargarArchivo();
    protected abstract void procesarDatos();

    private void guardarLog() {
        System.out.println("Guardando log...");
    }

}
