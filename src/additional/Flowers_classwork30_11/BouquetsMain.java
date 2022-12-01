package additional.Flowers_classwork30_11;

public class BouquetsMain {
    public static void main(String[] args) {
        Rose rose1 = new Rose(2);
        rose1.exp=2;
        Tulip tultip1 = new Tulip(0);
        tultip1.exp=0;
        Chrysanthemum chr1 = new Chrysanthemum();
        chr1.exp = 3;
        IFlowers [] interArray = {rose1,tultip1, chr1};
       Bouquets callBouquets = new Bouquets(interArray);
       String arrBou = callBouquets.check();
        System.out.println(arrBou);

    }
}
