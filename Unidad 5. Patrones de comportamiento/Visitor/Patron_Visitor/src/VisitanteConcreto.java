public class VisitanteConcreto implements Visitante{


    @Override
    public void visitar(EdificioResidencial edificioResidencial) {
        System.out.println("Agente de seguros visitando un edificio residencial.");
        edificioResidencial.venderSeguroMedico();
    }

    @Override
    public void visitar(Banco banco) {
        System.out.println("Agente de seguros visitando un banco.");
        banco.venderSeguroContraRobos();

    }

    @Override
    public void visitar(Cafeteria cafeteria) {
        System.out.println("Agente de seguros visitando una cafetería.");
        cafeteria.venderSeguroContraIncendiosEInundaciones();

    }
}
