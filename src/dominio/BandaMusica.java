package dominio;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BandaMusica extends Participante {

    private String nombrebanda;
    private ArrayList <Actuacion> actuaciones = new ArrayList<>();
    public BandaMusica(String nombrebanda){
        this.nombrebanda=nombrebanda;
    }
    public void annadirActuacion(Actuacion a){
        this.actuaciones.add(a);
    }

    @Override
    public String toString() {
        String str= this.nombrebanda;
        str = str + "\r\n" + "\r\n";
        for(Actuacion a: actuaciones){
            str= str + a.toString();
        }

        return str;
    }
}
