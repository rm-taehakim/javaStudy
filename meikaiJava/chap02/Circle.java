import java.util.Scanner;

public class Circle {

    /*
    final 변수

    - 값의 관리를 한 곳으로 집약
    - 프로그램이 읽고 보기 쉬움
    - final 변수의 이름은 일반 변수와 구별하게 쉽게 대문자를 이용
    - final 변수는 원칙적으로 초기화, 초기화되어 있지 않은 final 변수는 한 번만 대입 가능

    * 참고 : 프로그램 안에 삽입된 의도를 알기 힘든 수치를 매직넘버(magic number)라고 하는데
            final 변수를 도입하면 매직넘버를 제거할 수 있음

    */

    public static void main(String[] args) {
        final double PI = 3.1416; //원주율
        Scanner sc = new Scanner(System.in);

        System.out.println("반지름 : ");
        double r = sc.nextDouble(); //실숫값

        System.out.println("원주의 길이는 " + 2 * PI * r + " 이다");
        System.out.println("면적은 " + PI * r * r + " 이다");
    }
    
}