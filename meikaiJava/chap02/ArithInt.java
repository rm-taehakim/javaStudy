import java.util.Scanner;

public class ArithInt {
    
    // 키보드를 이용한 입력
    // Scanner 클래스

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("x와 y의 사칙연산");
        
        System.out.println("x의 값 : ");
        int x = sc.nextInt();

        System.out.println("y의 값 : ");
        int y = sc.nextInt();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y)); //나머지

    }
}