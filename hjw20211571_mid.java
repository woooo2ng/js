import java.util.Scanner;
import java.util.Random;

public class hjw20211571_mid {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int a, b = rand.nextInt(3) + 1;

        System.out.println("정수를 입력하시오 (1: 가위, 2: 바위, 3: 보)");
        while (true) {
            a = scanner.nextInt();
            if (a < 1 ||  a > 3)
                System.out.println("잘못된 입력입니다. 가위(1), 바위(2), 보(3) 중에 선택하세요.");
            else
                break;
        }

        System.out.print("사용자 선택: ");
        switch (a) {
            case 1:
                System.out.println("가위");
                break;
            case 2:
                System.out.println("바위");
                break;
            case 3:
                System.out.println("보");
                break;
        }

        System.out.print("컴퓨터 선택: ");
        switch (b) {
            case 1:
                System.out.println("가위");
                break;
            case 2:
                System.out.println("바위");
                break;
            case 3:
                System.out.println("보");
                break;
        }

        if (a == b)
            System.out.println("D R A W !");
        else if ((a == 1 && b == 3) ||  (a == 2 && b == 1) || (a == 3 && b == 2))
            System.out.println("W I N !");
        else
            System.out.println("L O S E !");

        scanner.close();
    }
}