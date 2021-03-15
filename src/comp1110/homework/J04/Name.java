package comp1110.homework.J04;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        String initialName = input.nextLine();

        String upperCaseName = initialName.toUpperCase();
        System.out.println(upperCaseName);

        System.out.println(upperCaseName.length());

    }
}
