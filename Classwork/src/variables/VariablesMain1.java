package variables;

public class VariablesMain1 {
    /*  public static void main(String[] args) {
        int agePrimitive = 10;
        Integer ageReference = 29;

        System.out.println(agePrimitive + 1);
        System.out.println(ageReference +1);
        System.out.println( Integer.toBinaryString(29));
    }

     */

    /* public static void main(String[] args) {
        int a = 10;
        int b = 10;

        a = Integer.MAX_VALUE;
        System.out.println( a + (long) b);


    } */

    static int a ;
    static int b ;
    static int c ;
    public static void main(String[] args) {
        a = 10;
        b = 3;

        c = plus ();
        print();
    }
        public static int plus(){
        return a + b;
      }

        public static void print(){
            System.out.println(c);
        }
}
