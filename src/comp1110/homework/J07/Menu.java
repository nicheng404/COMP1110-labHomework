package comp1110.homework.J07;

import java.util.Scanner;

public class Menu {
    //1
    public static int findRange(int[] array) {
        int max = Menu.getMax(array);

        int min = 99990;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }
        }


        return max - min;
    }

    //2
    public static int getMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];

            }
        }

        return max;
    }

    //3
    public static int getSecondHighest(int[] array) {
        int max = 0;
        max = Menu.getMax(array);

        for (int i = 0; i < array.length; i++) {
            if (max == array[i]) {
                array[i] = 0;

            }
        }

        int secondMax = Menu.getMax(array);

        return secondMax;
    }


    public static void main(String[] args) {
        System.out.println("Please enter:");
        System.out.println("1 to find range of the scores");
        System.out.println("2 to find the maximum score");
        System.out.println("3 to find the second highest score");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        int N = input.nextInt(); // size of array
        int[] inputArray = new int[N];
        for (int i = 0; i < inputArray.length; i++) { // set array
            inputArray[i] = input.nextInt();
        }


        switch (choice) {
            case 1:
                System.out.println(Menu.findRange(inputArray));
                break;
            case 2:
                System.out.println(Menu.getMax(inputArray));
                break;
            case 3:
                System.out.println(Menu.getSecondHighest(inputArray));
                break;
            default:
                System.out.println("Invalid Option Selected");

        }
    }
}
