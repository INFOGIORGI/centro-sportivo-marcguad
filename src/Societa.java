import java.util.HashMap;

public class Societa {
    private HashMap<String,Socio> soci;
    public Societa(){
        soci=new HashMap<>();
    }


    public boolean aggiungiSocio(String nome,String Cognome,String codice){
        if (!soci.containsKey(codice)) {
           
        Socio s = new Socio(nome, Cognome, codice);
        soci.put(codice,s);
        return true;
        }
        return false;
    }


    public boolean rimuoviSocio(String codiceSocio){
        if(soci.containsKey(codiceSocio)==true && soci.get(codiceSocio).getLungh()==0){
            soci.remove(codiceSocio);
            return true;
        }
        return false;
    }
}
