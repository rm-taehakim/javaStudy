import java.util.Random;
import java.util.Scanner;

public class SwitchBreak {

    /*
    switch문(switch statement)

    - switch(){}문
    어떤 식을 평가한 값에 따라서 프로그램의 흐름을 복수로 분기시키는 문
    ()괄호 안에 입력한 제어식은 정수형
    char, Character, byte, Byte, short, Short, int, Integer, 나열형 가운데 하나를 이용
    *** javaSE7부터는 정수형에 더해 문자열형도 허용 ***

    - 레이블(label)
    switch문 내의 어딘가로 프로그램이 이동할 곳을 나타내는 표시
    case 값 : //일치하는 레이블로 이동
    default : //어느 레이블과도 일치하지 않을 때 이동
    서로 다른 레이블이 동일한 값을 갖는 것은 허용되지 않음
    레이블의 값은 '상수'이고 변수는 허용되지 않음

    - break문(break statement)
    switch문 내의 프로그램의 흐름이 break문을 만나면 switch문의 실행을 종료
    마지막 case부분에 break문이 없어도 프로그램의 동작은 변하지 않지만, 레이블을 추가할 경우에 
    필요한 break문의 추가를 잊어버리는 오류를 예방하기 위해 마지막 case 부분의 끝에 break문을 반드시 입력


    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("가위 - 0, 바위 - 1, 보 - 2 선택 : ");
        int hand = sc.nextInt();

        //if문 
        if (hand == 0)
            System.out.println("가위");
        else if (hand == 1)
            System.out.println("바위");
            else if (hand == 2)
                System.out.println("보");


        //switch문
        switch (hand) {
            case 0: System.out.println("가위"); 
            break;
            case 1: System.out.println("바위");
            break;
            case 2: System.out.println("보");
            break;

        }


        System.out.println("정수를 입력 : ");
        int n = sc.nextInt();

        switch (n) {
            case 0: System.out.print("A"); //break문이 없어서 다음문으로 이동함
                    System.out.print("B");
                    break;
            case 2: System.out.print("C"); //break문이 없어서 다음문으로 이동함
            case 5: System.out.print("D");
                    break;
            case 6: //break문이 없어서 다음문으로 이동함
            case 7: System.out.print("E");
                    break;
            default: System.out.print("F");
                    break;

        }

        System.out.println("끝");


        //난수
        Random rd = new Random();
        int m = rd.nextInt(3); //0~2까지의 난수 생성

        switch (m) {
            case 0: System.out.println("가위");
            break;
            case 1: System.out.println("바위");
            break;
            case 2: System.out.println("보");
            break;
        }


        //계절
        System.out.println("월 입력 : ");
        int month = sc.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2: System.out.println("겨울");
            break;
            case 3:
            case 4:
            case 5: System.out.println("봄");
            break;
            case 6:
            case 7:
            case 8: System.out.println("여름");
            break;
            case 9:
            case 10:
            case 11: System.out.println("가을");
            break;
            default: System.out.println("없는 월");
            break;
        }

    }
    
}