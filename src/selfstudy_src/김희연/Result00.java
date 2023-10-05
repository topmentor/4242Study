
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Result00 extends Game00 {

    public void txt(int result) { //값이 들어가도록 해야함
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(result);
        System.out.println(a);

    }

    public void file() { //game.txt 파일 생성하는 메서드
        File file = new File("game.txt"); //C:\hy\test 파일 생성 <try 내부 블럭에 생성해도 상관 없음>

        try {
            boolean success = file.createNewFile(); //성공 여부 파악 & 새로운 파일을 생성 <boolean crateNewFile - 원하는 경로에 새 파일 생성>

            if(success) { //만약 파일 만드는것에 성공했다면,
                System.out.println("파일 생성 성공"); //"파일 생성 성공" 문구 출력
            } else { //그렇지 않다면
                System.out.println("파일 생성 실패"); //"파일 생성 실패" 문구 출력
            }
            } catch (IOException e) { //예외 처리 코드
                System.out.println(e);
            }
        }
    }
