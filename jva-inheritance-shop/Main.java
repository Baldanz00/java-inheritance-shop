public class Main {
public static void main(String[] args) {
    Smartphone s1 = new Smartphone(152689427, "Iphone15", "Apple", 1200.99, 22 , "125879645", 256);
<<<<<<< HEAD
    System.out.println(s1);
=======
    System.out.print(s1.getDettagliProdotto());

    Televisori t1 = new Televisori(55, true);
    System.out.println(t1.getDettagliProdotto());
>>>>>>> 2215bd6bb7cc17456ce5e84e1c02def05ffc4d58

    Televisori t1 = new Televisori(256847, "Samsung Oled", "Samsung", 15499.99, 22, 55, true);
    System.out.print(t1);

    Cuffie c1 = new Cuffie(569987, "Airpods", "Apple", 239.99, 22, "bianche", true);
    System.out.println(c1);
}
}
