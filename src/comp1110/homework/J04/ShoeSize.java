package comp1110.homework.J04;

import java.util.Scanner;

public class ShoeSize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double size = input.nextDouble();
        size = size* 5.0;


        double a = size- (int)size;
        //System.out.println(a);
        int newSize;
        if(a>=0.5){
            newSize = (int) size +1;
        }else{
            newSize = (int) size;
        }


        System.out.println(newSize);
    }

}

