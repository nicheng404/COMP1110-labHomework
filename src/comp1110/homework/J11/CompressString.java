package comp1110.homework.J11;

import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        //input string from console.
        Scanner input = new Scanner(System.in);
        String given = input.nextLine();

        //get length and string->char[]
        char[] givenArray= given.toCharArray();
        int givenLength=given.length();//qwqw

        //create output StringBuilder
        StringBuilder outputDemo = new StringBuilder();

        // 在for loop中，若后项!=前项，则统计前项个数，将前项与其个数放入output
        int beginIdx=0;
        int nextTermIdx=0;
        int numberofI=0;
        for (int i=0;i+1<givenLength;i++){
            if(givenArray[i]!=givenArray[i+1]){
                nextTermIdx=i+1;
                numberofI=nextTermIdx-beginIdx;
                outputDemo.append(givenArray[i]);
                // only print number when number!=1
                if (numberofI!=1){
                outputDemo.append(numberofI);
                }
                beginIdx=nextTermIdx;
            }
            //检测是否是input string的末段
            if (i + 1 == givenLength - 1){
                outputDemo.append(givenArray[i+1]);
                int last =0;
                last=i+2-beginIdx;
                // only print number when number!=1
                if(last!=1) {
                    outputDemo.append(last);
                }
            }
        }

        String output = outputDemo.toString();
        System.out.println(output);

    }
}
