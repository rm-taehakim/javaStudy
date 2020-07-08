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

    
    /*
    
    - 문자 리터럴(character literal)
    단일 문자를 '(작은 따옴표)'로 묶은 식
    '*' : 단일문자 * 를 나타냄, char형
    "*" : 문자 * 의 나열을 나타냄, String형


    */
        
        System.out.println("몇 개의 *를 표시할까? : ");
        int n = sc.nextInt();

        int e = 0;
        while (e < n) {
            System.out.println('*');
            e++;
        }
        System.out.println("e의 최종값 : " + e); // e = n

        
        int f = 0;
        while (f <= n) {
            System.out.println('*');
            f++;
        }
        System.out.println("f의 최종값 : " + f); // f = n+1


    /*

    - while문과 do문의 구분
    do문 : 후판정 반복 >>> loop body를 실행한 '후' 판정을 수행 (문은 반드시 한 번은 실행됨)
    while문 : 선판정 반복 >>> loop body를 실행하기 '전' 판정을 수행 (문이 실행되지 않을 수도 있음)


    * 참고 : do문의 loop body가 설령 단일문이라도 {} 를 사용하여 블록으로 해두는 게 좋음
    
    ex 1) do문과 while문의 구분이 어려움
    x = 0;
    do
        x++;
    while (x < 5);
    while (x >= 0)
        System.out.println(--x);

    ex 2) do문과 while문의 구분이 쉬움
    x = 0;
    do {
        x++;
    } while (x < 5);
    while (x >= 0)
        System.out.println(--x);


    */

        
        int m;
        int g = 0;

        do {
            System.out.println("몇 개의 #를 표시할까 ? : ");
            m = sc.nextInt();

        } while (g > m);
        while (g < m) {
            System.out.println('#');
            g++;
        }
        System.out.println("최종 g 값은 : " + g);

    }
    
}