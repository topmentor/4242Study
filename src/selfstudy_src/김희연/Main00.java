
public class Main00 {
    public static void main(String[] args) { //메인메서드
    Game00 g = new Game00(); //Game 생성자 호출
    g.Game(); //Game 메서드 실행

    Result00 r = new Result00(); //Result 생성자 호출
    r.txt(g.result); //txt 메서드 실헹 (Game의 결과값 호출)
    r.file(); //file 메서드 실행
    }
}
