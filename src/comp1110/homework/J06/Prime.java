package comp1110.homework.J06;

import java.util.Scanner;

public class Prime {
    //找素数方法：用一个数分别去除 2 到 sqrt( 这个数的平方根 ) ，如果能被整除， 则表明此数不是素数，反之是素数。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if (x==2){//从2开始
            System.out.println(2);
        } else if( x==3){
            System.out.println(2);
            System.out.println(3);

        }else if (x>=4){//从4开始
            System.out.println(2);
            System.out.println(3);

            for (int i=4; i<=x;i++){
                int count=0;
                for (int j=2; j<=Math.sqrt(i);j++){//若不能整除则count+
                    if (i%j != 0){
                        count++;
                    }

                    if (count==(int) Math.sqrt(i) -1){//从2-sqrt的整数中都没有能整除的
                        System.out.println(i);
                    }
                }
            }
        }


    }
}
