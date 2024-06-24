public class Banco implements Elemento{


    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }

    public void venderSeguroContraRobos() {
        System.out.println("Vendiendo seguros contra robos en un banco.");
    }
}
