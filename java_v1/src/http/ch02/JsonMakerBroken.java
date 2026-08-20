package http.ch02;

import java.util.ArrayList;
import java.util.List;

public class JsonMakerBroken {

    public static void main(String[] args) {
        String name = "홍\"길\"동";
        int age = 21;
        List<String> subjects = new ArrayList<>();
        subjects.add("수학");
        subjects.add("물리");
        subjects.add("컴퓨터과학");

        //위 데이터를 메서드를 호출해서
        // json 형식에 문자열로 변환하는 기능을 호출할예정

        String jsonStr = toJson(name,age,subjects);
        System.out.println(jsonStr);
    }
    //학생 정보를 JSON 문자열로 조립하는 기능(메서드)
    public static String toJson(String name,int age,List<String> subjects) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n" );
        sb.append("  \"name\" : \"").append(name).append("\",\n");
        sb.append("  \"age\" : ").append(age).append(",\n");
        sb.append("  \"subjects\" : [\n").append("   \"").append(subjects.get(0)+"\",\n");
        sb.append("   \"").append(subjects.get(1)+"\",\n");
        sb.append("   \"").append(subjects.get(2)+"\"\n  ]\n}");
        return sb.toString();
    }




}
