package comoop15;

public class UserMainTest {

    public static void main(String[] args) {

        //1번 Todo 객체와 User객체는서로 몰라도 각자 생성이된다

        ToDo toDo1 = new ToDo("자바 복습");
        ToDo toDo2 = new ToDo("오징어 공군");

        User user1 = new User("홍길동",1);
        User user2 = new User("우끼끼",1);
        User user3 = new User("호랑이",2);

        //2 아직 연결 되지않는 상태는 null
        user3.displayMyTask();


        //3 연관 관계 형성 -user1이 주소값을 갖제된다ㅏ
        user1.setTodo(toDo1);
        user2.setTodo(toDo2);

        user1.displayMyTask();
        user2.displayMyTask();
        user3.displayMyTask();

        // todo2 참조 변수를 통해서 상태를 바꿔본다 (중요)
        toDo2.setCompleted(true);

        //5 user2을 통해서 조회해 봐도 바뀐 상태가 보인다
        //즉 복사본이 아니라 같은 객체 하나를 함계 가리키고 있다
        user2.displayMyTask();




    }



}
