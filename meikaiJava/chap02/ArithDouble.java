import java.util.Scanner;

public class ArithDouble {

    /*
    기본형(primitive type)

    - 정수형
    byte : -128 ~ 127
    short : -32,768 ~ 32,767 
    int : -2,147,483,648 ~ 2,147,483,647 (+_21억)
    long : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807 (+_922경)

    - 부동소수점형 (실수)
    float : +_3.40282357E+38 ~ +_1.40E-45
    double : +_1.7976931348623157E+308 ~ +_4.9E-324

    - 문자형(char), 논리형(Boolean)


    */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x와 y의 사칙연산");

        System.out.println("x의 실숫값 : ");
        double x = sc.nextDouble(); //실수값을 입력 받음

        System.out.println("y의 실숫값 : ");
        double y = sc.nextDouble(); //실수값을 입력 받음

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y)); //나머지

        System.out.println("평균은 " + (x + y) / 2 + " 이다");

        System.out.println("삼각형의 넓이 구하기");
        System.out.println("밑변값 " + x + " 곱하기 높이값 " + y + " 의 1/2 = " + (x * y) * 0.5 + " 이다");
    }
}