public class Televisore extends Prodotto {
    private  int dimensioniPollici;
    private boolean smart;

    public Televisore(int codice, String nome, String marca, double prezzo, double iva, int dimensioniPollici, boolean  smart ) {
        super(int codice,String nome,String marca,double prezzo, double iva);
        this.dimensioniPollici = dimensioniPollici;
        this.smart = smart;0

    }

    public int getDimensioniPollici() {
        return dimensioniPollici;
    }

    public void setDimensioniPollici(int dimensioniPollici) {
        this.dimensioniPollici = dimensioniPollici;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
    @Override
    public String getDettagliProdotto() {
        return super.getDettagliProdotto() + "|" + dimensioniPollici + "," + "Smart: " + (smart ? "Si" : "No");
    }
}
