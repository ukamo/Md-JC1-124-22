package additional.Flowers_classwork30_11;

public class Chrysanthemum implements IFlowers {

  int exp;
    public Boolean checkExpired (){
        if ( exp >= 3){
            return false;
        } else{
            return true;
        }
    }
}
