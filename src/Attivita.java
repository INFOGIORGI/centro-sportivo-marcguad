public class Attivita {

    private HashMap<String, Socio> soci;
    private HashMap<String, Istruttore> istruttori;
    private String data;
    private String orarioInizio;
    private String orarioFine;
    private String descrizione;


    public Attivita(String data,String orarioInizio,String orarioFine,String descrizione){
        soci=new HashMap<>();
        isttruttori=new HashMap<>();
        this.data=data;
        this.orarioInizio=orarioInizio;
        this.orarioFine=orarioFine;
        this.descrizione=descrizione;

    }

    
}