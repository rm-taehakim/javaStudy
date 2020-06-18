import java.util.Scanner;

public class Mimus {
    
    /* 
    연산자(operator)와 피연산자(operand)

    예) x + y

    - 연산자 : 연산을 싱행하는 기호 (+)
    가감연산자(additive operator) : x + y, x - y
    승제연산자(multiplicative operator) : x * y, x / y, x % y
    단항부호연산자(unary plus operator and unary minus operator) :
        +x (x 자체의 값을 생성)
        -x (x 의 부호를 반전시킨 값을 생성)

    - 피연산자 : 연산의 대상이 되는 식 (x, y)
    단항연산자(unary operator) : 피연산자가 하나
    2항연산자(binary operator) : 피연산자가 둘
    3항연산자(ternary operator) : 피연산자가 셋

    * 참고 : java에는 4항 이상의 연산자는 없음

    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정숫값 : ");
        int a = sc.nextInt(); //정수값을 입력 받음
        
        int b = -a; //단항부호연산자, a의 부호를 반전시킨 값으로 b를 초기화
        System.out.println(a + " 의 기호를 반전시킨 값은 " + b + " 이다"); //a 또는 +a로 사용 가능

        System.out.println(a + "이라고 입력함");
        System.out.println("입력한 값에 10을 더한 값은 " + (a + 10) + " 이다");
        System.out.println("입력한 값에 3을 뺀 값은 " + (a - 3) + " 이다");


        
    }
}