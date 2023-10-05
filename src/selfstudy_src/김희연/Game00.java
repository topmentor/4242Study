
public class Game00 {
    int cnt = 0; //cnt는 0으로 초기화
    int result = 0; //result는 0으로 초기화
    public void Game() { //게임 메서드
        int Num = (int) (Math.random() * 10 + 1); //Num : 1~10까지 숫자 랜덤으로 출력
        int WriteNum = 0; //WriteNum : 사용자 입력 값 & 0으로 초기화

        while (true) { //반복문
                if (cnt > 2) { //만약 cnt가 0,1,2이 지나 cnt=3이 된다면
                System.out.println("실패입니다"); //"실패입니다" 문구 출력
                return; //3번 실행되고 나면 더이상 실행되지 않도록 return문 사용
                }
                System.out.println("숫자를 입력하세요"); //"숫자를 입력하세요" 문구 출력
                WriteNum = Integer.parseInt(new java.util.Scanner(System.in).nextLine()); //WriteNum : 사용자가 입력한 값
                if (WriteNum == Num) { //만약에 WrtieNum == Num 이라면
                    System.out.println("정답입니다"); //"정답입니다" 문구 출력
                } else if (Num > WriteNum) { //Num이 WriteNum보다 크다면
                    System.out.println("높음"); //"높음" 문구 출력
                } else if (Num < WriteNum) { //Num이 WriteNum보다 작다면
                    System.out.println("낮음"); //"낮음" 문구 출력
                }
            cnt += 1; //cnt 1씩 증가
            result = WriteNum; //result : 사용자가 입력한 값
            }
        }
    }

//intArray[i] = scanner.nextInt(); 키보드에 입력받은 정수 저장