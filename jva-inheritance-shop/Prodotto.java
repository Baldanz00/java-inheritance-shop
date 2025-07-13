//Creare la classe Prodotto che gestisce i prodotti dello shop.
//Un prodotto è caratterizzato da:
//- codice (numero intero)
//- nome
//- marca
//- prezzo
//- iva
//Usate opportunamente i livelli di accesso (public, private),
// i costruttori, i metodi getter e setter ed eventuali altri 
//metodi di “utilità” per fare in modo che:
//- il codice prodotto sia accessibile solo in lettura
//- gli altri attributi siano accessibili sia in lettura che in scrittura
//Lo shop gestisce diversi tipi di prodotto:
//- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
//- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
//- Cuffie, caratterizzate dal colore e se sono wireless o cablate
//Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella 
//stesura delle classi che gestiscono i vari sotto tipi di prodotto

public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    //costruttore
    public Prodotto() {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    //getter e setter 
    
    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public double getIva() {
        return iva;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    
    //metodo per calcolo prezzo con iva
    public double getPrezzoConIva() {
        return prezzo + (prezzo*iva/100);
    }

    public String getDettagliProdotto() {
        return "Codice: " + codice + " " + marca + " " + nome + "-" + "Prezzo: € " + getPrezzoConIva();
    }
}
