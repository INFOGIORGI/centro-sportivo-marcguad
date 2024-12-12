import java.util.HashMap;

public class Societa {
    private HashMap<String,Socio> soci;
    private HashMap<String,Itruttore> istruttori;
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

    public boolean aggiungiIstruttore(String nome,String Cognome,String codiceIstruttore){
        if (!istruttori.containsKey(codiceIstruttore)) {
           
        Istruttore i = new Istruttore(nome, Cognome, codiceIstruttore);
        istruttori.put(codiceIstruttore,i);
        return true;
        }
        return false;
    }


    public boolean rimuoviIstruttore(String codiceIstruttore){
        if(istruttori.containsKey(codiceIstruttore)==true && istruttori.get(codiceIstruttori).getLungh()==0){
            istruttori.remove(codiceIstruttore);
            return true;
        }
        return false;
    }

    public boolean assegnaIstruttore(String codiceSoci, String codiceIstruttore) {
        if (!istruttori.containsKey(codiceIstruttore) || !soci.containsKey(codiceSoci) || soci.get(codiceSoci).getIstruttoreAssegnato() != null) {
            return false;
        } else {
            Istruttore i = istruttori.get(codiceIstruttore);
            Socio s = pazienti.get(codiceSoci);
            i.setMedicoAssegnato(s); 
            s.addPaziente(i); 
            return true;
        }
    }

    public boolean rimuoviAssegnazione(String codiceIstruttore, String codiceSocio){
        if(istruttori.containsKey(codiceIstruttore)==true && istruttori.get(codiceIstruttori).getLungh()==0){
            istruttori.remove(codiceIstruttore);
            return true;
        }
        return false;
    }

    public Paziente getSoci(String codiceSocio){
        if(soci.containsKey(codiceSocio)){
            return soci.get(codiceSocio);
        }else{
            return null;
        }
    }
}
