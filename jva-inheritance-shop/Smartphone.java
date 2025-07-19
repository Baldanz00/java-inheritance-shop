

public class Smartphone extends Prodotto{
    private String imei;
    private int memoriaGb;

    //costruttore
   public Smartphone(int codice, String nome, String marca, double prezzo, double iva , String imei , int memoriaGb) {
      super(codice, nome, marca, prezzo, iva);
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

   @Override
   public String toString() {
      return super.toString() + "IMEI: " + imei + ", memoria GB: " + memoriaGb;
   
}
}
