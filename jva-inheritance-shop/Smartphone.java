public class Smartphone extends Prodotto {
    private String imei;
    private int memoriaGB;
    
    public Smartphone(int imei , int memoriaGB) {
        super(codice, nome,prezzo, iva);
        this.imei = imei;
        this.memoriaGB = memoriaGB;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemoriaGB() {
        return memoriaGB;
    }

    public void setMemoriaGB(int memoriaGB) {
        this.memoriaGB = memoriaGB;
    }
    @Override
    public String getDettagliProdotto() {
        return super.getDettagliProdotto() + "IMEI: " + imei + "| Memoria: " + memoriaGB + "GB";
    }

}
