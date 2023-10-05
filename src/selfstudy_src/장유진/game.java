package 숫자맞추기게임;

import java.util.ArrayList;
import java.util.Scanner;

public class game {
    public void game() {
        ArrayList<Integer> a = new ArrayList<Integer>();  //결과값을 저장하는 리스트

        Scanner scanner = new Scanner(System.in);

        while (true) { //무한 반복
            int n = (int) (Math.random()*10) + 1;
            System.out.println("기회는 3번! 1에서 10까지의 숫자를 맞춰보세요 ^0^/");
            System.out.println("숫자를 입력하세요 :");

            for (int x=0; x<3; x++) { //3번의 기회
                int num = scanner.nextInt();
                a.add(num); //리스트 a에 입력값 저장
                if (num == n)
                { System.out.println("당신은 천재 ?!"); break;}
                else if (num > n)
                { System.out.println("높음"); }
                else
                { System.out.println("낮음"); }
            }System.out.println(a); //결과 출력이 도저히 해결이 안돼서 그냥 여기 넣어봤습니다
        }
    }
    }