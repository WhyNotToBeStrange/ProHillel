package Home1;


import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        System.out.println(args);
        String revers = new StringBuffer(String.valueOf(args)).reverse().toString();
        System.out.println(revers);

    }

}

