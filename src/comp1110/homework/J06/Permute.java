package comp1110.homework.J06;

import java.util.Scanner;

public class Permute {
    public static void main(String[] args) {
        //输入两个string
        Scanner input = new Scanner(System.in);
        String A = input.nextLine();
        String B = input.nextLine();
        int lengthA= A.length();
        int lengthB= B.length();

        //判断长度
        if (lengthA==lengthB){
            //转换char array
            char[] arrayCharA= A.toCharArray();
            char[] arrayCharB= B.toCharArray();

            //for循环比较。1比较位置char 2相等则改0 且count++ break内层循环
            int count= 0;
            for (int i=0 ; i < arrayCharA.length; i++){
                for (int j=0; j < arrayCharB.length; j++){
                    if (arrayCharA[i] == arrayCharB[j]){//比较位置char
                        arrayCharB[j]='0';//相等则改0
                        count++; //count+
                        break;//break内层循环
                    }
                }
            }


            if (count==lengthA){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }/*长度不对直接NO*/ else {
            System.out.println("No");
        }



    }
}
