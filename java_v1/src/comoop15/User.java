package comoop15;

public class User {

    private int id;
    private String userName;
    //연관관계 :  User는 Todo 객체의 주소값을 담을수 있는 참조 변수를 가진다
    private ToDo todo;

    public User(String userName, int id) {
        this.userName = userName;
        this.id = id;
        //todo는 초기화 하지 않았으므로 null상태이다
        //참조타입 핃드의 기본값은
    }
    // 할일을 할당 받는 메서드 연관관계 형성
    public void setTodo(ToDo todo) {
        this.todo = todo;
    }

    public  void displayMyTask() {
        System.out.println(id + "번 " + userName + "님의 현재 할일 정보입니다");

        if (todo == null) {
            System.out.println("현재 등록된 할일이 없습니다");
        } else {
            //연관된 Todo객체의 메서드를 호출한다
            todo.showInfo();
        }
    }


}
