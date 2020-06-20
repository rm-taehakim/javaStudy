import java.util.Scanner;

public class Positive {
    
    /*
    선택문(selection statement)
    프로그램의 흐름을 분기시킴
    if문(if statement), switch문(switch statement)
    

    - if()문
    어떤 조건이 성립할 경우에만 실행해야 할 처리가 있으면 if문으로 구현
    ()내에 기술된 조건판정을 위한 식을 제어식이라고 함
    논리값 리터럴(Boolean literal)

    * 참고 : if다음에 ()괄호가 없으면 에러


    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정숫값 n : ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("이 값은 정수");


    /*
    
    - 관계연산자(relational operator) *2항연산자(피연산자 2개여야 함)
    피연산자(operand)의 대소관계를 판정하는 연산자
    x < y, x > y, x <= y, x >= y

    - if()문 else문(if-else문)
    조건의 진위에 따라서 다른 처리를 실행
    true이면 else 앞쪽의 문을 실행, false이면 else 다음의 문을 실행

    * 참고 : else 앞쪽에 문이 없으면 에러

    */

        System.out.println("입력값 m : ");
        int m = sc.nextInt();

        if (m > 0)
            System.out.println("이 값은 양수");
        else
            System.out.println("이 값은 0이거나 음수");


    /*
    
    - 등가연산자(equality operator) *2항연산자
    x == y : 좌우의 피연산자가 '같은지 다른지'
    x != y : 좌우의 피연산자가 '다른지 아닌지'


    */

        System.out.println("정수 a : ");
        int a = sc.nextInt();
        
        System.out.println("정수 b : ");
        int b = sc.nextInt();

        if (a == b)
            System.out.println("두 값은 같다");
        else
            System.out.println("두 값은 다르다");


        if (a != b)
            System.out.println("두 값은 다르다");
        else
            System.out.println("두 값은 같다");


    /*
    
    - 논리부정연산자(logical complement operator) *단항연산자
    !x : 피연산자의 값이 true이면 false를 생성, false이면 true를 생성
    

    */

        System.out.println("정숫값 c : ");
        int c = sc.nextInt();

        if (!(c != 0))
            System.out.println("이 값은 0");
        else
            System.out.println("이 값은 0이 아님");

        /*
        
        위 프로그램의 if문은 등가연산자 !=, == 를 사용하여 조금 더 간결하게 사용하는 게 좋음

        if (c != 0)
            System.out.println("이 값은 0이 아님");
        else
            System.out.println("이 값은 0");


        if (c == 0)
            System.out.println("이 값은 0");
        else
            System.out.println("이 값은 0이 아님");


        */

    /*

    - 중복 if문
    if문 안에 if문이 있는 '이중'구조

    */

        System.out.println("정숫값 d : ");
        int d = sc.nextInt();

        if (d > 0)
            System.out.println("이 값은 양수");
        else if (d < 0)
            System.out.println("이 값은 음수");
            else
                System.out.println("이 값은 0");
        
        /*

        else if (d == 0)
           System.out.println("이 값은 0");
        
        else if문을 중복사용해도 됨
        else if문을 사용 후 else문으로 끝나지 않아도 된다

        셋 중 어느 것도 출력되지 않거나, 둘 이상이 출력되는 경우는 없다


        */


        //절대값 출력

        if (d >= 0)
            System.out.println("이 값의 절대값은 " + d);
        else
            System.out.println("이 값의 절대값은 " + -d); //단항부호연산자

        
        //두 양의 정수 중 후자의 약수 판단

        System.out.println("첫번째 양의 정수 x : ");
        int x = sc.nextInt();

        System.out.println("두번째 양의 정수 y : ");
        int y = sc.nextInt();

        if (y / x == 0) //등가연산자
            System.out.println("y는 x의 약수");
        else
            System.out.println("y는 x의 약수가 아님");


        //다른 방식의 중복if문

        System.out.println("양의 정수 z :");
        int z = sc.nextInt();

        if (z > 0)
            if (z % 2 == 0)
                System.out.println("z는 짝수");
            else
                System.out.println("z는 홀수");
        else
            System.out.println("입력한 값이 양수가 아님");

        
        if (z > 0)
            if (z % 3 == 0)
                System.out.println("z는 3으로 나누어짐");
            else if (z % 3 == 1)
                System.out.println("z는 3으로 나누어지고 나머지가 1임");
            else if (z % 3 == 2)
                System.out.println("z는 3으로 나누어지고 나머지가 2임");
        else
            System.out.println("입력한 값이 양수가 아님");
        
        
        
    }

}