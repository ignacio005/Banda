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
        String str = this.nombrerefuerzo + ", " + this.instrumento + ", " + this.valor + " €";
        str = str + "\r\n" + "\r\n";


        return str;
    }
}
