import java.util.Random;
import java.util.Scanner;

public class hjw20211571_mid4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerChoice, computerChoice;

        String[] choices = {"묵", "찌", "빠"};
        int winner = 0; // 0: 무승부, 1: 플레이어 승, 2: 컴퓨터 승

        while (true) {
            // 플레이어 입력
            while (true) {
                System.out.print("정수를 입력하시오 1(묵), 2(찌), 3(빠) : ");
                playerChoice = scanner.nextInt(); // a에 정수 입력

                if (playerChoice >= 1 && playerChoice <= 3) {
                    break;
                } else {
                    System.out.println("재입력 : ");
                }
            }

            // 컴퓨터 선택
            computerChoice = random.nextInt(3) + 1;

            // 현재 선택 출력
            System.out.println("Player : " + choices[playerChoice - 1] + "\tComputer : " + choices[computerChoice - 1]);

            // 가위바위보 승자 결정
            if (playerChoice == computerChoice) {
                System.out.println("D R A W");
            } else if ((playerChoice == 1 && computerChoice == 2) || // 묵 vs 찌
                       (playerChoice == 2 && computerChoice == 3) || // 찌 vs 빠
                       (playerChoice == 3 && computerChoice == 1)) { // 빠 vs 묵
                System.out.println("W I N !");
                winner = 1; // 플레이어 승리
            } else {
                System.out.println("L O S E");
                winner = 2; // 컴퓨터 승리
            }

            // 묵찌빠 진행
            if (winner != 0) {
                while (true) {
                    System.out.print("다시 선택하세요 1(묵), 2(찌), 3(빠) : ");
                    playerChoice = scanner.nextInt(); // 플레이어 재입력

                    computerChoice = random.nextInt(3) + 1; // 컴퓨터 재선택

                    // 현재 선택 출력
                    System.out.println("Player : " + choices[playerChoice - 1] + "\tComputer : " + choices[computerChoice - 1]);

                    if (playerChoice == computerChoice) {
                        if (winner == 1) {
                            System.out.println("플레이어 승리로 게임 종료!");
                        } else {
                            System.out.println("컴퓨터 승리로 게임 종료!");
                        }
                        scanner.close();
                        return; // 게임 종료
                    }

                    // 묵찌빠 조건이 유지되는지 확인
                    if ((playerChoice == 1 && computerChoice == 2) || // 묵 vs 찌
                        (playerChoice == 2 && computerChoice == 3) || // 찌 vs 빠
                        (playerChoice == 3 && computerChoice == 1)) { // 빠 vs 묵
                        winner = 1; // 플레이어 승리
                    } else {
                        winner = 2; // 컴퓨터 승리
                    }
                }
            }
        }
    }
}
