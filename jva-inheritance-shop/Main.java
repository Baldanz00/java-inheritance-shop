public class Main {
public static void main(String[] args) {
    Smartphone s1 = new Smartphone(152689427, "Iphone15", "Apple", 1200.99, 22 , "125879645", 256);
    System.out.print(s1.getDettagliProdotto());

    Televisori t1 = new Televisori(55, true);
    System.out.println(t1.getDettagliProdotto());


}
}
