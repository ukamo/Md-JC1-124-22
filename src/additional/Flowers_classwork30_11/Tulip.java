package additional.Flowers_classwork30_11;

public class Tulip implements IFlowers {

    int exp;

    public Tulip(int exp) {
        this.exp = exp;
    }

    public Boolean checkExpired() {
        if (exp >= 3) {
            return false;
        } else {
            return true;
        }
    }

}


