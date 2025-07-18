//Create una classe Carrello con metodo main, 
//in cui chiedete all’utente di valorizzare un carrello 
//di prodotti con dati inseriti tramite scanner.
//Durante la richiesta di valorizzazione chiedete all’utente se 
//sta inserendo uno Smarphone o un Televisore o Cuffie e in base
// alla scelta dell’utente utilizzate il costruttore opportuno.
//Al termine dell’inserimento stampate il carrello
// (fate l’override del metodo toString per restituire le 
//informazioni da stampare per ogni classe)

import java.util.Scanner;
public class Carrello {
    private Prodotto[] prodotti;
    private int indiceCorrente;

   //costruttore
   
    public Carrello(int maxProdotti) {
        prodotti = new Prodotto[maxProdotti];
        indiceCorrente=0;
    }

    //metodo per aggiungere i prodotti
    public void aggiungiProdotto(Prodotto p1) {
        if(indiceCorrente < prodotti.length) {
            prodotti[indiceCorrente] = p1;
            indiceCorrente++;
        } else {
            System.out.println("Il carrello è pieno.");
        }
    }
    
    //metodo che mi stampa tutti i prodotti
    public void stampaCarrello() {
        System.out.println("\n contenuto del carrello: ");
        if(indiceCorrente == 0) {
            System.out.println("Il carrello è vuoto.");
        } else {
            for (int i = 0; i < indiceCorrente; i++) {
                System.out.println("-" + prodotti[i]);
            }
        }
    }
}