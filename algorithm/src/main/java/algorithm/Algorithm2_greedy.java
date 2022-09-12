package algorithm;

import java.util.Scanner;

public class Algorithm2_greedy {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        int change = 1000 - scanner.nextInt();
        int result = 0;

        int [] coins = {500,100,50,10,5,1};

        for(int coin : coins){

            if (coin > change)
                continue;
            result += change / coin;
            change %= coin;

        }
        System.out.println(result);
    }
}