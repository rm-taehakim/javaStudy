import java.util.Scanner;

public class CountDown {

    /*
    while문(while statement)

    - while문
    while + (식) + 문
    식(제어식)을 평가한 값이 true일 동안에 문을 반복해서 실행


    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("카운트 다운");
        
        int x;

        do {
            System.out.print("양의 정숫값을 입력 : ");
            x = sc.nextInt();
        } while (x <= 0);

        while (x >= 0) {
            System.out.println(x);
            x--; // 후치 감소연산자, x의 값을 하나씩 감소해서 출력
        }

        System.out.println("현재 x의 값 : " + x);
        
        // 위 while문에서 x의 값은 0까지만 출력되지만
        // while문 종료시점에서 x의 값은 -1 이다
    
    /*
    
    - 후치 증가연산자(postfix increment operator)와 후치 감소연산자(postfix decrement operator)
    후치 : 피연산자의 뒤(오른쪽)에 연산자를 적용한다는 의미
    x++, x--

    식 x++, x-- 가 생성하는 것은 증가/감소 '전'의 값
    
    ex)
    x = 5;
    y = x++;
    ** y에 대입되는 값은 5, 대입이 끝난 후 x의 값은 6 **


    - 전치 증가연산자(prefix increment operator)와 전치 감소연산자(prefix decrement operator)
    전치 : 피연산자의 앞(왼쪽)에 연산자를 적용한다는 의미
    ++x, --x

    식 ++x, --x 가 생성하는 것은 증가/감소 '후'의 값

    ex)
    x = 5;
    y = ++x;
    ** y에 대입되는 값은 6, 대입이 끝난 후 x의 값은 6 **


    */
    

    // 식의 평가순서
    // 2항 연산자의 평가순서는 좌->우

        int a = 3;
        int b = (a++) * (2 + a);
        System.out.println("a = " + a); // a = 4
        System.out.println("b = " + b); // b = 18

    // 식 (a++) 평가, 평가에 의해 얻어지는 값은 증가 전의 3, 평가가 완료된 후 4
    // 식 (2 + a) 평가, 여기서 a의 값은 평가가 완료된 후 값인 4
    // 3 * 6 = 18

    
    /*

    - 식의 값의 버림
    연산결과는 사용하지 않고 버릴 수 있음
    식의 평가가 완료된 값을 버리는 문에서는 전치, 후치 연산자 모두 같은 결과를 얻을 수 있음


    */

        int y;

        do {
            System.out.print("0 ~ 10까지의 정숫값 : ");
            y = sc.nextInt();
        } while (y <= 0 || y >= 10);

        while (y >= 0 && y <= 10) {
            System.out.println(y);
            y++; //연산결과를 사용하지 않고 버림
        }

        System.out.println("현재 y의 값 : " + y);

        
        int z;

        do {
            System.out.print("0 ~ 10까지의 정숫값 : ");
            z = sc.nextInt();
        } while (z <= 0 || z >= 10);
        
        while (z >= 0 && z <= 10) {
            System.out.println(++z); //연산결과를 그대로 사용
        }
        

        System.out.println("현재 z의 값 : " + z);

    }
    
}