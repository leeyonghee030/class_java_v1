package useful.ch16;

public class Demo6 {


    public static void main(String[] args) {
        MathOperation2 num1 = (x,y)-> x > y ? x:y;
        System.out.println(num1.operate(100,10));
    }
}
