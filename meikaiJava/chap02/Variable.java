public class Variable {

    /*
    변수(variable)

    - 변수의 선언(declaration)
    변수는 값을 저장하기 위한 상자와 같은 것 -> 상자 안의 값을 변경하는 것이 자유로움
    변수를 사용하기 위해서는 먼저 선언을 해서 형(type) 과 이름을 붙임
    변수는 필요할 때 선언

    * 참고 : ,(콤마)를 사용하여 둘 이상의 변수를 한번에 선언 가능

    - 대입연산자(assignment operator)
    연산자 = : 우변의 값을 좌변의 변수에 대입

    - 변숫값 표시
    출력되는 것은 변수의 '값', '변수명'이 아님

    */

    public static void main(String[] args) {
        int x; // x 는 int형 변수 선언
        x = 63; // x 에 63을 대입
        System.out.println(x); // x 의 값을 표시


    /*
    
    - 산술연산과 연산의 그룹화
    여러 개의 연산을 할 경우 사칙연산의 우선순위와 동일하므로 ()와 *,/를 잘 사용해야 함
    int는 정수형 변수이므로 '정수/정수' 연산에서 소수점 이하는 버림


    */

        int a;
        int b;
        // int a, b; 로도 선언 가능
        
        a = 63;
        b = 18;

        System.out.println("a의 값은 " + a + "이다");
        System.out.println("b의 값은 " + b + "이다");

        System.out.println("합계는 " + (a + b) + "이다");
        System.out.println("평균은 " + (a + b) / 2 + "이다"); //소수점 버림

    
    /*
    
    - 변수와 초기화(initialize)와 대입
    값이 들어있지 않은 변수에서는 값을 꺼낼 수 없음
    초기화 : 변수를 선언할 때 값(초기화자)을 입력
    대입 : 생성된 변수에 값을 입력

    */

        int y = 63; // 초기화
        int z = 16; // 초기화
        z = 17; // 대입
        z = 18; // 대입 > 이전에 초기화하거나 대입한 값은 반영되지 않음, 가장 마지막에 대입한 값이 최종 값

        System.out.println("y의 값은 " + y + "이다");
        System.out.println("z의 값은 " + z + "이다");
        System.out.println("합계는 " + (y + z) + "이다");
        System.out.println("평균은 " + (y + z) / 2 + "이다");


    }
    
}