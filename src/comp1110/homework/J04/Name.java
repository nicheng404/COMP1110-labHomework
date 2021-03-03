package comp1110.homework.J04;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        String initialName = input.nextLine();
        /*
        String upperCase= new String();
        name = upperCase.toUpperCase(name);

        */
        String name = initialName.toUpperCase();
        System.out.print(name);

    }
}
