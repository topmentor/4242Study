package 숫자맞추기게임;

import java.util.ArrayList;
import java.util.Scanner;

public class result {
    public void result() {
        ArrayList<game> a = new ArrayList<game>(); //game클래스에 있는 ArrayList랑 연결되는 ..

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s == "result")
            System.out.println(a); //결과 출력.. 인데 해결이 안되네유 ..

    }
}
