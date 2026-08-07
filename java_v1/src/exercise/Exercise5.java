package exercise;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
    //요구 사항을 확인하고 프로그램을 작성해보세요
        System.out.println("성적 점수를 입력해주세요");
        System.out.println("0~ 100 숫자로 적어주세요");
        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        if (score < 0 || score > 100){
            System.out.println("입력 범위를 벗어났습니다 다시 실행해주세요");
        } else {
            if (score >= 90) {
                System.out.println("'A' 학점: 우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.");
            } else if (score >= 80) {
                System.out.println("'B' 학점: 좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!");
            } else if (score >= 70) {
                System.out.println("C' 학점: 괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.");
            } else if (score >= 60){
                System.out.println("'D' 학점: 학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.");
            } else {
                System.out.println("F' 학점: 불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.");
            }
        }

        sc.close();
    }
}
