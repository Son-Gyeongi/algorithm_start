package algorithm;

import java.util.Scanner;

public class IlikeChar {
    public static void main(String[] args) {
        char[][] array = {
                {'A','B','K','T'},
                {'K','F','C','F'},
                {'B','B','Q','Q'},
                {'T','P','Z','F'}
        };
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char d = sc .next().charAt(0);

        for (int i=0 ; i< array.length; i++) {
            for(int j=0; j< array.length; j++) {
                if(c == array[i][j] || d == array[i][j]) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}
