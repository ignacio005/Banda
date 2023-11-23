package dominio;


import java.math.BigDecimal;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MusicoRefuerzo extends Participante{
    private String nombrerefuerzo;
    private String instrumento;
    private BigDecimal valor;
    public MusicoRefuerzo(String nombrerefuerzo, String instrumento, BigDecimal valor) {
        this.nombrerefuerzo=nombrerefuerzo;
        this.instrumento=instrumento;
        this.valor=valor;
    }
    @Override
    public String toString(){
        String str = nombrerefuerzo + "," + instrumento + "," + valor + " €";
        str = str + "\r\n";


        return str;
    }
}
