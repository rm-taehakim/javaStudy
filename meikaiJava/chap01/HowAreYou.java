public class HowAreYou {
    
    /*
    프로그램의 구조

    - 클래스 선언
    클래스 이름의 첫 문자는 대문자
    클래스 이름과 파일 이름은 동일해야 함

    - main 메소드
    public static void main(String[] args) {
    }

    - statement (문)
    프로그램 실행의 단위
    main 메소드 안의 순차적으로 실행되어 수행해야 할 처리문
    statemenet 의 끝에는 원칙적으로 ;(세미콜론) 필요 (일부예외도 있음)

    * 참고 : 주석은 문이 아님, 클래스 선언도 문이 아님

    */

    public static void main(String[] args) {
        System.out.println("세미콜론이 있을 경우");
        // System.out.println("세미콜론이 없을 경우") -> syntax에러
    

    /*

    - 문자열과 리터럴
    문자열 리터럴(string literal) : " " (큰따옴표)로 둘러싸임 문자의 나열
    literal 뜻 : 문자 그대로의
    정수 리터럴, 부동수점 리터럴, 문자 리터럴 등이 있음

    - 콘솔 화면으로의 출력과 스트림
    콘솔 화면을 포함한 외부와의 입출력에는 스트림(stream) 을 이용
    System.out 은 콘솔 화면과 결합한 스트림이고 표준 출력 스트림(standard output stream) 이라고 함
    print 는 줄 바꿈 x
    println 는 줄 바꿈 o

    의뢰된 처리를 실행하는 print와 println 은 프로그램의 부품이고, 이와 같은 부품을 메소드(method) 라 함

    */
    
        System.out.print("표준 출력 스트림으로 표시하고");
        System.out.print(" 줄 바꿈을 하지 않는다");
        System.out.println(); //비워두면 줄 바꿈만 실행됨
        System.out.println("표준 출력 스트림으로 표시하고");
        System.out.println("줄 바꿈을 한다");


    /*
    
    - 문자열의 연결 
    여러 개의 문자열 리터럴을 연결 (+) 
    줄 바꿈 x

    - 줄 바꿈
    줄 바꿈 문자를 표시하는 특별한 표기 (\n)

    - 기호문자
    + (더하기), - (빼기), * (곱하기), / (나누기), \ (역슬래쉬, KS코드에서는 원), | (버티컬바) 등등

    */

        System.out.println("문자열을" + " 연결하라");
        System.out.println("문자열을\n줄 바꿈하라");


    /*
    
    - java는 자유형식 입력 가능
    단, 단어 중간에 공백문자 안됨
    문자열 리터럴 중간에서 줄 바꿈 안됨

    */

            System      .   out.
    println (
                "자유롭게 입력 가능\n근데 보기 안 좋음..."
    );
        /*
        System.out.println("문자열 리터럴
                                            중간에서 줄 바꿈 안됨"); > 에러남
        */
    }

    /*

    - 들여쓰기 (indentation)
    읽기 쉽게 계층에 깊이에 따라서 들여쓰기 사용
    
    */
}