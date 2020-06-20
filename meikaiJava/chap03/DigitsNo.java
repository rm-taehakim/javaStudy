import java.util.Scanner;

public class DigitsNo {

    /*

    - 식(expression)
    변수, 리터럴(literal), 변수와 리터럴을 연산자로 결합한 것의 총칭
    oo연산자에 의해 결합된 식을 oo식 이라고 함
    ex) 대입연산자 > 대입식

    - 평가(evaluation)
    식의 값을 조사하는 것
    식에는 기본적으로 '형'과 '값'이 있고, '값'은 프로그램이 실행될 때 조사됨

    - 식문(expression statement)
    식에 ;(세미콜론)을 붙인 문
    
    - 공문(empty statement)
    식 없이 ;(세미콜론)만 있어도 문으로 인정
    ex) if (n > 0) ; //n이 0보다 크면 공문을 실행(공문에 아무것도 없기 때문에 아무것도 실행되지 않음)
            System.out.println("이 값은 양수"); //if문과 상관없이 항상 출력

    - 논리곱연산자 && (logical and operator)
    x && y : x와 y 모두 true이면 true, 둘 중 하나라도 false이면 false

    - 논리합연산자 || (logical or operator)
    x || y : x와 y 둘 중 하나라도 true이면 true, 모두 false이면 false


    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정숫값 n : ");
        int n = sc.nextInt();
        
        if (n == 0)
            System.out.println("0입니다");
        else if (n >= -9 && n <= 9)
            System.out.println("1자릿수");
            else
                System.out.println("2자릿수 이상");
    
        
        System.out.println("정숫값 m : ");
        int m = sc.nextInt();

        if (m <= -10 || m >= 10)
            System.out.println("2자릿수 이상");
        else
            System.out.println("2자릿수 미만");


    /*

    - 단락평가(short circuit evaluation)
    논리연산의 전체 식을 평가한 결과가 왼쪽 피연산자를 평가한 결과만으로 분명해질 경우
    오른쪽 피연산자의 평가가 실행되지 않는 것
    논리곱연산자 &&, 논리합연산자 || 의 평가에서는 단락평가가 실행됨

    * 참고 : 연산자 &, 연산자 | 에 의한 연산에서는 단락평가가 실행되지 않음



    */

        System.out.println("계절을 알려줘 \n몇 월? : ");
        int month = sc.nextInt();

        if (month >= 3 && month <= 5)
            System.out.println("봄");
        else if (month >= 6 && month <= 8)
            System.out.println("여름");
            else if (month >= 9 && month <= 11)
                System.out.println("가을");
                else if (month == 12 || month == 1 || month == 2)
                    System.out.println("겨울");

        /*

        겨울의 경우처럼 논리연산이 이중으로 사용된 경우,
        a || b || c 는 (a || b) || c 로 간주

        */

    
    /*
    
    - 조건연산자(conditional operator) *3항연산자(유일함)
    x ? y : z 
    x가 true면 y를 평가한 값을, x가 false이면 z를 평가한 값을 생성
    *** 조건연산자를 이용한 조건식은 if문을 응축한 것과 같기 때문에 즐겨 사용됨 ***


    */


        System.out.println("정수 a : ");
        int a = sc.nextInt();
        System.out.println("정수 b : ");
        int b = sc.nextInt();

        //if문 사용
        int min1;

        if (a < b)
            min1 = a;
        else
            min1 = b;

        System.out.println("값이 작은 쪽은 " + min1 + " 이다");
        //a와 b의 값이 같으면 변수 min에 대입되는 것은 b


        //조건식 사용
        int min2 = a < b ? a : b;
        System.out.println("값이 작은 쪽은 " + min2 + " 이다");


        //변수 min 없이 출력문에 바로 사용
        System.out.println("값이 작은 쪽은 " + (a < b ? a : b) + " 이다");


        //두 값의 차 표시
        int diff = a > b ? (a - b) : (b - a);
        System.out.println("a 와 b 두 값이 차는 " + diff + " 이다");


        //두 값의 차 표시 2
        String str = a - b <= 10 && a - b >= -10 ? "두 값의 차는 10이하" : "두 값의 차는 11이상";
        System.out.println("a와 b 두 값의 차는 " + str + " 이다");
        

    }
    
}