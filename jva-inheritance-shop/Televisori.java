public class Televisori extends Prodotto {
    private int dimensioni;
    private boolean  smart;
   
     //costruttore
    public Televisori(int codice, String nome, String marca, double prezzo, double iva, int dimensioni, boolean smart) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public int getDimensioni() {
        return dimensioni;
    }

    public boolean isSmart() {
        return smart;
    }
    public String getDettagliProdotto() {
        return getDettagliProdotto() + "Dimensioni: " + getDimensioni() + "E' smart: " + smart;
    }
  
    

}
