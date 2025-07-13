public class Cuffie extends Prodotto{
    private String colore;
    private boolean bluetooth;

    public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean bluetooth) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.bluetooth = bluetooth;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
    @Override
    public String getDettagliProdotto() {
        return super.getDettagliProdotto() + "|Colore: " + colore + "- Bluetooth: " + (bluetooth ? "Si" : "No");
    }
}
