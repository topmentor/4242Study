package 숫자맞추기게임;

// 1~10 사이 임의의 숫자(정답숫자)를 컴퓨터가 만들면 사용자가 숫자를 입력해서 숫자를 맞춘다.
// 입력 숫자가 정답 숫자보다 높으면 '높음' 낮으면 '낮음'으로 표시 총 3번의 기회 안에 숫자를 맞춰야 성공

public class main {
    public static void main(String[] args) {
        game g = new game();
        g.game();

        result r = new result();
        r.result();
    }
 }
