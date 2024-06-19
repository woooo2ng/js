import java.util.Scanner;
import java.util.Random;

public class hjw20211571_mid3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int playerChoice, computerChoice;
        String[] choices = {"묵", "찌", "빠"};

        // 컴퓨터의 선택 (1: 묵, 2: 찌, 3: 빠)
        computerChoice = rand.nextInt(3) + 1;

        // 사용자의 선택 입력 받기
        while (true) {
            System.out.println("정수를 입력하시오 (1: 가위, 2: 바위, 3: 보)");
            playerChoice = scanner.nextInt();

            if (playerChoice < 1 || playerChoice > 3) {
                System.out.println("잘못된 입력입니다. 가위(1), 바위(2), 보(3) 중에 선택하세요.");
            } else {
                break;
            }
        }

        // 사용자와 컴퓨터의 선택 출력
        System.out.print("사용자 선택: ");
        switch (playerChoice) {
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
        switch (computerChoice) {
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

        // 가위바위보 승패 결정
        if (playerChoice == computerChoice) {
            System.out.println("D R A W !");
        } else if ((playerChoice == 1 && computerChoice == 3) || 
                   (playerChoice == 2 && computerChoice == 1) || 
                   (playerChoice == 3 && computerChoice == 2)) {
            System.out.println("W I N !");

            // 사용자가 승리한 경우 묵찌빠 선택
            System.out.println("묵, 찌, 빠 중 하나를 선택하세요 (1: 묵, 2: 찌, 3: 빠)");
            int mukChipBa = scanner.nextInt();

            // 사용자 선택 출력
            switch (mukChipBa) {
                case 1:
                    System.out.println("사용자 선택: 묵");
                    break;
                case 2:
                    System.out.println("사용자 선택: 찌");
                    break;
                case 3:
                    System.out.println("사용자 선택: 빠");
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 묵(1), 찌(2), 빠(3) 중에 선택하세요.");
                    break;
            }

            // 컴퓨터 선택 출력
            switch (computerChoice) {
                case 1:
                    System.out.println("컴퓨터 선택: 묵");
                    break;
                case 2:
                    System.out.println("컴퓨터 선택: 찌");
                    break;
                case 3:
                    System.out.println("컴퓨터 선택: 빠");
                    break;
            }

            // 묵찌빠 승패 결정
            if (mukChipBa == computerChoice) {
                System.out.println("D R A W !");
            } else if ((mukChipBa == 1 && computerChoice == 3) || 
                       (mukChipBa == 2 && computerChoice == 1) || 
                       (mukChipBa == 3 && computerChoice == 2)) {
                System.out.println("W I N !");
            } else {
                System.out.println("L O S E !");
            }
        } else {
            System.out.println("L O S E !");
        }

        scanner.close();
    }
}
