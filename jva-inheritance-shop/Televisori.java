public class Televisori {
    private int dimensioni;
    private boolean  smart;
   
     //costruttore
    public Televisori(int dimensioni, boolean smart) {
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
