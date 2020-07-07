import java.util.Random;
import java.util.Scanner;

public class Season {

    /*
    do문(do statement)

    - do문
    do + 문 + while (식);
    식(제어식)을 평가한 값이 ture일 경우에 한해서 문을 반복해서 실행
    
    * 참고 : 반복되는 문은 loop body(루프 본체)


    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int retry;

        do {
            System.out.print("계절을 알려줌. \n 몇 월? : ");
            int month = sc.nextInt();

            if (month >= 3 && month <= 5)
                System.out.println("봄");
            else if (month >= 6 && month <= 8)
                System.out.println("여름");
            else if (month >= 9 && month <= 11)
                System.out.println("가을");
            else if (month == 12 || month == 1 || month == 2)
                System.out.println("겨울");

            System.out.print("다시 한 번? \n (1 = yes, 2 = no) : ");
            retry = sc.nextInt();
        } while (retry == 1);


    /*

    - 일정범위 값의 입력 
    부정한 값(false)을 제어식을 평가한 값의 true로 설정하면 됨


    */

        int hand;    

        do {
            System.out.print("손을 선택 (1 = 가위, 2 = 바위, 3 = 보) : ");
            hand = sc.nextInt();
        } while (hand < 1 || hand > 3); // 연속조건
        // do문에서 요구하는 값이 아닌 부정한 값(1,2,3 이외의 값) 일 경우 loop body 반복

        switch (hand) {
            case 1: System.out.println("가위");
                    break;
            case 2: System.out.println("바위");
                    break;
            case 3: System.out.println("보");
                    break;
        }

    /*

    - 드모르간의 법칙(De Morgan's Law) 과 반복
    '각 조건의 부정을 취한 후 논리곱,논리합을 바꾼 값'의 부정이 원래 조건과 동일하게 되는 것

    x && y 와 !(!x || !y) 는 같다
    x || y 와 !(!x && !y) 는 같다

    x && y, x || y : 연속조건
    !(!x || !y), !(!x && !y) : 종료조건의 부정


    */

        Random rd = new Random();

        int no = rd.nextInt(100); // 0 ~ 99 사이의 난수 생성

        System.out.println("난수 no 의 수 맞히기 (0 ~ 99 사이의 수)");
        
        int x;
        do {
            System.out.print("몇 일까? : ");
            x = sc.nextInt();

            if (x > no)
                System.out.println("노노, 그것보다 작아");
            else if (x < no)
                System.out.println("노노, 그것보다 커");
        } while (x != no); //종료조건의 부정을 사용하여 loop body 반복

        System.out.println("정답!");
    }
}