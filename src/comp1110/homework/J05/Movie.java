package comp1110.homework.J05;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String movieName = input.nextLine();
        int movieLength = input.nextInt();

        int hour = movieLength / 60;
        int minute = movieLength % 60;

        if (hour == 0) {

            if (minute == 0) {
                System.out.println(movieName + " runs for");
            } else if (minute == 1) {
                System.out.println(movieName + " runs for " + minute + " minute");
            } else if (minute > 1) {
                System.out.println(movieName + " runs for " + minute + " minutes");
            }

        } else if (hour == 1) {
            if (minute == 0) {
                System.out.println(movieName + " runs for " + hour + " hour");
            } else if (minute == 1) {
                System.out.println(movieName + " runs for " + hour + " hour and " + minute + " minute");
            } else if (minute > 1) {
                System.out.println(movieName + " runs for " + hour + " hour and " + minute + " minutes");
            }

        } else if (hour > 1) {
            if (minute == 0) {
                System.out.println(movieName + " runs for " + hour + " hours");
            } else if (minute == 1) {
                System.out.println(movieName + " runs for " + hour + " hours and " + minute + " minute");
            } else if (minute > 1) {
                System.out.println(movieName + " runs for " + hour + " hours and " + minute + " minutes");

            }


        }

    }
}
