import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Elemento> edifices = new ArrayList<>();
        edifices.add(new EdificioResidencial());
        //edifices.add(new Banco());
        //edifices.add(new Cafeteria());

        Visitante agente = new VisitanteConcreto();

        for (Elemento edificio : edifices) {
            edificio.aceptar(agente);
        }




    }
}