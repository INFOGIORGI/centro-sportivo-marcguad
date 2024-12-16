public class Istruttore {
    private String nome;
    private String cognome;
    private String codiceIstruttore;
    private HashMap<String,Istruttore> lista_soci;

    public Socio(String nome, String cognome, String codiceIstruttore) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceSocio = codiceIstruttore;
        lista_soci = new HashMap<>();
        
    }

    public Istruttore getIstruttore(){
        return this;
    }

}
