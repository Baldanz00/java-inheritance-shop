public class Prodotto {
    private final int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    //costruttore
    public Prodotto(int codice, String marca, double prezzo, double iva) {
        this.codice=codice;
        this.nome=nome;
        this.marca=marca;
        this.prezzo=prezzo;
        this.iva=iva;
    }

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

    //metodo
    public double getPrezzoConIva() {
        return prezzo +(prezzo* iva/100)
    }
    public String getDettagliProdotto() {
        return "Codice: " + codice + " " + marca + " " + nome + "-" + "Prezzo: € " + getPrezzoConIva();
        
    }

}
