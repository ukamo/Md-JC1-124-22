package variables;
//correct code lesson 002.10
public class VariablesMain6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;



        int c = plus (a, b);
        int z = minus (a,b);
        print(c);
        print(z);
    }
    public static int plus(int z, int x){
        return z + x;
    }

    public static int minus(int m, int l){
        return m - l;
    }

    public static void print(int y){
        System.out.println(y);
    }
}
