public class Main {
public static void main(String[] args) {

    Smartphone s1 = new Smartphone(152689427, "Iphone15", "Apple", 1200.99, 22 , "125879645", 256);
    System.out.println(s1);

    Televisori t1 = new Televisori(256847, "Samsung Oled", "Samsung", 15499.99, 22, 55, true);
    System.out.print(t1);

    System.out.print(" ");

    Cuffie c1 = new Cuffie(569987, "Airpods", "Apple", 239.99, 22, "bianche", true);
    System.out.println(c1);

    Carrello carrello = new Carrello(4);
    carrello.aggiungiProdotto(new Smartphone(153216, "A5", "Samsung", 950, 22, "lg45321", 256));
    carrello.aggiungiProdotto(new Televisori(535354, "Philips", "Philips", 1200, 22, 50, false));
    carrello.aggiungiProdotto(new Cuffie(135783210, "Samsung pods", "Samsung", 350, 22, "bianco", true));
    carrello.stampaCarrello();
}
}
