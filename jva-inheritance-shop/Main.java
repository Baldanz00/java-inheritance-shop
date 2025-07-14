public class Main {
public static void main(String[] args) {

    Smartphone s1 = new Smartphone(152689427, "Iphone15", "Apple", 1200.99, 22 , "125879645", 256);
    System.out.println(s1);

    Televisori t1 = new Televisori(256847, "Samsung Oled", "Samsung", 15499.99, 22, 55, true);
    System.out.print(t1);

    System.out.print(" ");

    Cuffie c1 = new Cuffie(569987, "Airpods", "Apple", 239.99, 22, "bianche", true);
    System.out.println(c1);
}
}
