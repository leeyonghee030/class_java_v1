package useful.ch04;

public class ArrayExceptionHandling {

    public static void main(String[] args) {

        //배열 선언과 동시에 초기화
        int[] arr = {1, 2, 3, 4, 5};

//ArrayIndexOutOfBoundsException

        try {
            for(int i = 0; i < 10; i++) {
                System.out.println("arr[" + i + "} =" + arr[i]);
            }
        }catch (Exception e) {
            //System.out.println("catch 블록으로 넘어왔음");
            System.out.println(e.getMessage());
            e.printStackTrace();
            //어디에서 오류났는지 알수있는
        }

        System.out.println("프로그램이 비정상적으로 종료 되지 않았음");

        





    }
}
