public class Cafeteria implements  Elemento{


    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }

    public void venderSeguroContraIncendiosEInundaciones() {
        System.out.println("Vendiendo seguros contra incendios e inundaciones en una cafetería.");
    }
}
