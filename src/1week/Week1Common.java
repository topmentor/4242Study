package study4242;

import java.util.Scanner;

public class Week1Common {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        String outStr = "";

        for(int i=0; i<inputStr.length() ; i++){
            char tmp = inputStr.charAt(i);

            if(Character.isDigit(tmp)) {	//문자열이 숫자 경우
                outStr += tmp;
            }
        }

        System.out.println(inputStr + " ---> " + outStr );
    }
}
