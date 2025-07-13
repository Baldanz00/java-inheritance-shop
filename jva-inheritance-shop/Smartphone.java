

public class Smartphone extends Prodotto{
    private String imei;
    private int memoriaGb;

    //costruttore
   public Smartphone(String imei , int memoriaGb) {
    this.imei = imei;
    this.memoriaGb = memoriaGb;
   }

//getter e setter
   public String getImei() {
    return imei;
   }

   public int getMemoriaGb() {
    return memoriaGb;
   }

   public String getDettagliProdotto() {
        return getDettagliProdotto() + "IMEI: " + imei + "| Memoria: " + memoriaGb + "GB";
   
}
}
