package algorithm;

import java.util.Scanner;

public class TailFind {
    public static void main(String[] args) {
        String [][] array = new String[3][10];
        Scanner sc = new Scanner(System.in);
        String lastPlus = "";

        for(int i=0; i<array.length; i++) {
            String a = sc.next();
            lastPlus += a.substring(a.length()-1);
        }

        System.out.println(lastPlus);

//        String a = sc.next();
//        String b = sc.next();
//        String c = sc.next();
//
//        String lastA = a.substring(a.length()-1);
//        String lastB = b.substring(b.length()-1);
//        String lastC = c.substring(c.length()-1);
//
//        System.out.println(lastA+lastB+lastC);
    }
}
