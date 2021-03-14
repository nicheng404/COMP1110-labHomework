package comp1110.homework.J06;

import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        //输入十进制int
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //转换成二进制字符串
        String binaryNumber = Integer.toBinaryString(number);

        //字符串转int数组
        int[] intArray = new int[binaryNumber.length()];
        for (int i = 0; i<binaryNumber.length() ; i++){
            intArray[i]=Integer.parseInt(binaryNumber.substring(i, i + 1));
        }

        //辨别1并累计
        int count = 0;
        for (int n : intArray){
            if (n % 2 != 0){
                count++;
            }
        }

        //输出1的个数
        System.out.println(count);
    }
}
