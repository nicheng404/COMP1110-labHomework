package comp1110.homework.J05;

import java.util.Scanner;

public class Odd {

    public static boolean isOdd(int i){
        return i % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (Odd.isOdd(number)){
            System.out.println(number + " is odd");
        }else {
            System.out.println(number + " is even");
        }

    }
}
