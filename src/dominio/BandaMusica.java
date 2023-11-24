package dominio;

import java.util.ArrayList;

public class BandaMusica extends Participante {

    private String nombrebanda;
    private ArrayList <Actuacion> actuaciones = new ArrayList<>();
    public BandaMusica(String nombrebanda){
        this.nombrebanda=nombrebanda;
    }
    public void annadirActuacion(Actuacion a){
        actuaciones.add(a);
    }

    @Override
    public String toString() {
        String str = this.nombrebanda;
        return str;
    }

}
