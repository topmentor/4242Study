package javagame;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.*;

public class Numbergame {

	public static void main(String[] args) throws Exception {

		// 정답 미리보기
		Random random = new Random();
		int randomNum = random.nextInt(10);
		System.out.println(("정답 미리보기:") + randomNum);

		System.out.println("지금부터 제가 1부터 10 사이의 수 중 하나를 선택하겠습니다");
		System.out.println("선택을 마쳤습니다.제가 뽑은 숫자는 과연 어떤 숫자일지 여러분은 지금부터 맞춰주시길 바랍니다");

		// 컴퓨터가 선택한 랜덤 숫자
		int randonmNum = (int) (Math.random() * 10) + 1;

		// 총 3번의 기회가 주어짐
		for (int i = 0; i < 3; i++) {
			System.out.println(3 - i + "번의 기회가 남았습니다");

			System.out.println("추측한 숫자를 입력하세요");

			// 게임 참여자가 선택한 숫자 입력하기(스캐너 사용)
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();

			// 입력 숫자를 Arraylist에 저장하기
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.add(6);
			list.add(7);
			list.add(8);
			list.add(9);
			list.add(10);

			if (choice > randomNum)
				System.out.println("높습니다");

			else if (choice < randomNum) {
				System.out.println("낮습니다");

			}

			else {
				System.out.println("축하드려요~정답입니다!");
				System.out.println("게임을 다시 하시겠습니까(Y/N)?");
				Scanner scan;
				String a = sc.next();
				if (a.equals("N")) {
					System.out.println("게임을 종료합니다");
					break;
				} else {
					randomNum = (int) (Math.random() * 10) + 1;

					System.out.println("지금부터 제가 1부터 10 사이의 수 중 하나를 선택하겠습니다");
					System.out.println("선택을 마쳤습니다.제가 뽑은 숫자는 과연 어떤 숫자일지 여러분은 지금부터 맞춰주시길 바랍니다");
				}
				sc.close();

				// 텍스트 파일 안에 게임 결과 넣기
				File dir = new File("C:" + File.separator + "game");
				File file = new File(dir, "game.txt");
				if (file.createNewFile()) {
					System.out.println("game.txt파일을 생성했습니다");

				} else {
					System.out.println("game.txt파일은 이미 존재합니다.");
				}

			}

		}

	}
}
