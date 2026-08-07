package comoop15;

public class ToDo {

    private String content;
    //참고 boolean에 필드명에 관례상 is를 붙이지 않습니다.
    private boolean completed;

    //getter

    public String getContent() {
        return content;
    }
    //getter - boolean 타입은 관례상 is로 만들어준다
    public boolean isCompleted() {
        return completed;
    }

    //setter-단순히 상태값만 변경하는 메서드를 set 으로 만들어준다
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public ToDo(String content) {
        this.content = content;
    }

    public void showInfo() {
        String status;

        if (completed) {
            status = "[완료]";
        }else {
            status = "[미완성]";
        }
        System.out.println("할 일 내용:" + content + "," + status);
    }


}
