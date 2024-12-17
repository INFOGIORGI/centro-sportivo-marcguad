import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class Societa {
    private HashMap<String,Socio> soci;
    private HashMap<String,Itruttore> istruttori;
    
    public Societa(){
        soci=new HashMap<>();
        isttruttori=new HashMap<>();
        }


    public boolean aggiungiSocio(String nome,String Cognome,String codice){
        if (soci.containsKey(codice)) {
           
        Socio s = new Socio(nome, Cognome, codice);
        soci.put(codice,s);
        return true;
        }
        return false;
    }


    public boolean rimuoviSocio(String codiceSocio){
        if(soci.containsKey(codiceSocio)==true && soci.get(codiceSocio)==0){
            soci.remove(codiceSocio);
            return true;
        }
        return false;
    }

    public boolean aggiungiIstruttore(String nome,String Cognome,String codiceIstruttore){
        if (istruttori.containsKey(codiceIstruttore)) {
           
        Istruttore i = new Istruttore(nome, Cognome, codiceIstruttore);
        istruttori.put(codiceIstruttore,i);
        return true;
        }
        return false;
    }


    public boolean rimuoviIstruttore(String codiceIstruttore){
        if(istruttori.containsKey(codiceIstruttore)==true && istruttori.get(codiceIstruttori)==0){
            istruttori.remove(codiceIstruttore);
            return true;
        }
        return false;
    }

    public boolean assegnaIstruttore(String codiceSoci, String codiceIstruttore) {
        if (istruttori.containsKey(codiceIstruttore) || !soci.containsKey(codiceSoci) || soci.get(codiceSoci).getIstruttoreAssegnato() != null) {
            return false;
        } else {
            Istruttore i = istruttori.get(codiceIstruttore);
            Socio s = soci.get(codiceSoci);
            i.setIstruttoreAssegnato(s); 
            s.aggiungiSocio(i); 
            return true;
        }
    }

    public boolean rimuoviAssegnazione(String codiceIstruttore, String codiceSocio){
        if(istruttori.containsKey(codiceIstruttore)==true && istruttori.get(codiceIstruttori)==0){
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
    
    public void leggiFile(String path){
        File file = new File (path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            String riga = scanner.nextLine();
            String [] rigaSplittata = riga.split(";");
            if(rigaSplittata[0].equals("S")){
                aggiungiSocio(rigaSplittata[1],rigaSplittata[2],rigaSplittata[3]);

            }
            else if(rigaSplittata[0].equals("I")){
                aggiungiIstruttore(rigaSplittata[1],rigaSplittata[2],rigaSplittata[3]);

            }
            else if(rigaSplittata[0].equals("AT")){
                aggiungiAttivita(rigaSplittata[1],rigaSplittata[2],rigaSplittata[3],rigaSplittata[4],rigaSplittata[5]);

            }

        }
    }
    
    
    public void scriviFile(String path) {
        FileWriter myWriter = null; // Dichiarazione del FileWriter
        try {
            myWriter = new FileWriter(path); // Inizializzazione del FileWriter
            for (Socio s : soci.values()) {
                // Creazione della stringa da scrivere nel file
                String getSoci = "S;" + s.getNome() + ";" + s.getCognome() + ";" + s.getCodiceSocio() + "\n";
                myWriter.write(getSoci); // Scrittura nel file
            }
        } catch (IOException e) {
            
        }
    }


}
