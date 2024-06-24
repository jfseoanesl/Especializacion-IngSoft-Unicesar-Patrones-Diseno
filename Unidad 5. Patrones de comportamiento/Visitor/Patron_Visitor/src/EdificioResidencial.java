public class EdificioResidencial implements Elemento{


    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }
    public void venderSeguroMedico() {
        System.out.println("Vendiendo seguros médicos en un edificio residencial.");
    }

}
