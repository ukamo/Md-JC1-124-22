public class TestArguments {

    public static void main(String[] args) {
        System.out.println("Mass +" + args.length);
        for (String arg : args){
            System.out.println(arg);
        }
    }
}
