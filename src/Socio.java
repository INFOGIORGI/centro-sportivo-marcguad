import java.util.HashMap;

public class Socio{
    private String nome;
    private String cognome;
    private String codiceSocio;
    private HashMap<String,Istruttore> lista_istruttori;
    private String IstruttoreAssegnato;


    public Socio(String nome, String cognome, String codiceSocio) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceSocio = codiceSocio;
        lista_istruttori = new HashMap<>();
    }


    public Socio getSocio(){
        return this;
    }

    public Medico getIstruttoreAssegnato() {
        return istruttoreAssegnato;
    }
    
    public String getCodiceSocio() {
        return codiceSocio;
    }
    
    public void setIstruttoreAssegnato(Istruttore i) {
        this.IstruttoreAssegnatoAssegnato = IstruttoreAssegnato;
    }

}