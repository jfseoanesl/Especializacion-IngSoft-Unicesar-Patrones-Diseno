public class Main {
    public static void main(String[] args) {
        ProcesamientoArchivos supermercado = new Supermercado();
        supermercado.procesadorArchivos();

        System.out.println("-------------------------------------");

        ProcesamientoArchivos farmacia = new Farmacia();
        farmacia.procesadorArchivos();
    }
}