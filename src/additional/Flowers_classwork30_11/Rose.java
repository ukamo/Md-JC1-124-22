package additional.Flowers_classwork30_11;

public class Rose implements IFlowers {
 int exp ;

    public Rose(int exp) {
        this.exp = exp;
    }

    @Override
    public Boolean checkExpired() {
        if (exp >= 3) {
            return false;
        } else {
            return true;
        }
    }
}
