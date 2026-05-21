import java.util.ArrayList;

public class Ristorante {
    String nome;
    StringBuilder descrizione;
    Indirizzo indirizzoRistorante;
    ArrayList<Data> orariApertura;
    ArrayList<Piatto> Menu;

    ArrayList<Ordine> ordiniRicevuti;

    Ristoratore ristoratoreResponsabile;

    public Ristorante(String nome, StringBuilder descrizione, String via, int civico, String citta, int cap, String giorno,int inizioServizio,int fineServizio){
        this.nome=nome;
        this.descrizione= new StringBuilder();
        this.indirizzoRistorante= new Indirizzo(via,civico,citta,cap);
        this.orariApertura=new ArrayList<>();
        this.Menu=new ArrayList<>();
    }

    void addOrariApertura(Data d){
        orariApertura.add(d);
    }
    void removeOrariApertura(Data d){
        orariApertura.remove(d);
    }

    void addPiatto(Piatto p){
        Menu.add(p);
    }
    void removePiatto(Piatto p){
        Menu.remove(p);
    }

    void addOrdine_Ricevuti(Ordine o){
        ordiniRicevuti.add(o);
    }

}
