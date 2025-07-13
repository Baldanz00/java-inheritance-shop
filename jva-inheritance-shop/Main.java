public class Main {
    public static  void main(String[]args) {
        Smartphone s1 = new Smartphone(101,"Iphone 15", "Apple",1299,99 , "1568423415", 256);
        Televisore t1 = new Televisore (254, "Samsung Oled", "Samsung" , 1599.99, 22, 55, true);
        Cuffie c1 = new Cuffie (369, "Airpods", "Apple", 299.99 , "Bianche", true);

        System.out.println(s1.getDettagliProdotto());
        System.out.println(t1.getDettagliProdotto());
        System.out.println(c1.getDettagliProdotto());
    }
}
