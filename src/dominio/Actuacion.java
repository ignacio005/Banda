package dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Actuacion {

    private LocalDate fecha;
    private ArrayList <Participante> participantes= new ArrayList<>();
    public void annadirParticipante(Participante p ){
        this.participantes.add(p);

    }
    public Actuacion(LocalDate fecha){
        this.fecha=fecha;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    @Override
    public String toString(){
        String str="Fecha de actuación: ";
        str = str + this.fecha.format(DateTimeFormatter.ISO_DATE);
        str = str + "\r\n";
        for(Participante p: participantes){
            str= str + p.toString();
        }

        return str;
    }
}
