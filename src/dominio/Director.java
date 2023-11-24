package dominio;

public class Director extends Participante {

    private String nombredirector;
    public Director(String nombredirector){
        this.nombredirector=nombredirector;
    }
    @Override
    public String toString() {
        String str = ", director";
        str = this.nombredirector + str;
        str = str + "\r\n";

        return str;
    }
}
