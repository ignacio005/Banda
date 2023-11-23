package dominio;


public class MusicoSocio extends Participante{

    private String nombresocio;
    private String instrumento;
    private int numerosocio;
    public MusicoSocio(String nombresocio, String instrumento, int numerosocio) {
        this.nombresocio=nombresocio;
        this.instrumento=instrumento;
        this.numerosocio=numerosocio;
    }
    @Override
    public String toString(){
        String str = nombresocio + ", " + instrumento + ", " + "número de socio: " + numerosocio;
        str = str + "\r\n";

        return str;
    }
}
