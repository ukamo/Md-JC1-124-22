package debug;

import java.util.Arrays;

public class Debug1 {
    public static boolean isDebugMode = false;

    public static void main(String[] args) {

        checkDebugMode(args);
        int a = 10;
        int b = 3;
        if (a + b > 10) {
            if (isDebugMode) {
                System.out.println("true JM");
            }
            a = 5;
        } else {
            if (isDebugMode) {
                System.out.println("false JM");
            }
            a = 11;
        }
        System.out.println(a + b);

    }

    public static void checkDebugMode(String[] arr) {
        for (String arg : arr) {
            if ("debug".equalsIgnoreCase(arg)) {
                isDebugMode = true;
            }
        }

    }
}
