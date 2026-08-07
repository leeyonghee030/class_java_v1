package ch05;

/**
 * 관계 연산자 (비교 연산자)
 * 연산에 결과는 true / false로 반환된다.
 */
public class Operation5_1 {
    public static void main(String[] args) {

        //게임 캐릭터 상태 설정
        int playerHealth = 50; //플레이어의 체력
        int platerLevel = 10; //플레이어의 레벨
        int enemyHealth = 30; // 적군 체력
        int enemyLevel = 15; //적군 레벨

        // 1. 플레이어의 체력이 적 체략 보다 높은지 확인하는 코드 작성 출력
        System.out.println(playerHealth > enemyHealth);
        // 2. 플레이어 체력이 위험 수준인 20이하 인지 확인
        System.out.println(playerHealth <= 20);
        // 3. 플레이어와 적에 체력이 같은지 확인
        System.out.println( playerHealth == enemyHealth);
        // 4. 플레이어의 특정 레벨이 30 이상 인지 확인
        System.out.println(platerLevel >= 30);

        //주의 사항 - 경계값 포함여부
        // 이하 <= 경계값 포함
        // 이상 >= 경계값 포함
        // 미만 < 경계값 x
        // 초과 > 경계값 x

        //5. 플레이어의 체력이 30 미만인지 확인
        System.out.println(playerHealth < 30);
        //6. 플레이어의 체력이 50 초과인지 확인
        System.out.println(playerHealth > 50 );



    }
}
