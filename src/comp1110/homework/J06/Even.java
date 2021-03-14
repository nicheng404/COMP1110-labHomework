package comp1110.homework.J06;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i =1 ; i<=number; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

    }
}
