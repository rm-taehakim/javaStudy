public class Element {

    /*
    프로그램의 구성요소

    - 키워드(keyword)
    if, else, switch등의 단어에는 특별한 의미가 있어서 변수 등의 이름으로 이용할 수 없음
    ex) int, new, private, super, this, try, const, goto 등
    *** 정식 키워드는 아니지만, 그에 준하는 단어 : true, false, null ***
    
    - 구분자(separator)
    단어를 구분하기 위해 사용하는 기호 (분리자라고도 함)
    [ ] ( ) { } , . :

    - 식별자(identifier)
    변수, 레이블, 메소드, 클래스 등에 주어진 이름
    식별자의 첫 문자는 모든 문자($와 _를 포함)로 시작
    식별자의 두 번째 문자는 모든 문자($와 _를 포함), 숫자 사용 가능
    $는 java컴파일러가 바이트코드를 생성할 때 내부적으로 이용하는 문자, 소스 프로그램에서는 사용하지 않도록 권장
    *** 키워드와 더불어 true, false, null도 식별자로서 이용할 수 없음 ***

    - 리터럴(literal)
    정수 리터럴, 부동소수점 리터럴, 문자열 리터럴 등도 프로그램을 구성하는 요소의 하나임

    - 연산자(operator)
    연산자는 우선순위(precedence)가 있음
    같은 우선순위의 연산자가 연속할 때, 어느 쪽의 연산을 먼저 실행하는 지를 표시하는 결합규칙(associativity)
    ex) 가감연산자 - : 좌결합, 대입연산자 = : 우결함
    

    * 참고 : 대입과 초기화
    대입식을 평가하면 대입 후 왼쪽 피연산자의 형과 값을 얻을 수 있음
    대입식 a = b = 1 -> a = (b = 1) -> a = b 로 대입, 초기화를 동반하는 선언에는 적용할 수 없음
    ex) int a = b = 0; //에러
        int a = 0, b = 0; //ok


    - 연산자 일람 (적당히 알아두면 좋은 것들만)
    1(좌)   [] 인덱스연산자 ex) x[y]
            () 메소드 호출연산자 ex) x()
            . 멤버액세스연산자 ex) x.y
            ++ 후치 증가연산자 ex) x++
            -- 후치 감소연산자 ex) x--

    2(우)*  ++ 전치 증가연산자 ex) ++x
            -- 전치 감소연산자 ex) --x
            + 단항 +연산자 ex) +x
            - 단항 -연산자 ex) -x
            ! 논리부정연산자 (true, false) ex) !x
            
    3(좌)   () 캐스트연산자 ex) (x - y) * z 에서 캐스트연산자가 우선함 

    4(좌)   * 승제연산자 (곱하기)
            / 승제연산자 (나누기)
            % 승제연산자 (나머지)

    5(좌)   + 가감연산자 (더하기)
            - 가감연산자 (빼기)

    6(좌)   << 시프트연산자 (비트값 왼쪽이동)
            >> 시프트연산자 (비트값 오른쪽이동)

    7(좌)   < 관계연산자 (true, false) (작다)
            > 관계연산자 (true, false) (크다)
            <= 관계연산자 (true, false) (작거나 같다)
            >= 관계연산자 (true, false) (크거나 같다)

    8(좌)   == 등가연산자 (true, false) (같다)
            != 등가연산자 (true, false) (같지않다)

    9(좌)   & 비트 논리곱연산자

    10(좌)  ^ 비트 배타적 논리합연산자

    11(좌)  | 비트 논리합연산자

    12(좌)  && 논리곱연산자

    13(좌)  || 논리합연산자

    14(좌)  ? : 조건연산자 ex) x ? y : z

    15(우)* = 단순대입연산자
            *= 복합대입연산자
            /= 복합대입연산자
            %= 복합대입연산자
            += 복합대입연산자
            -= 복합대입연산자
            &= 복합대입연산자
            ^= 복합대입연산자
            |= 복합대입연산자

    */
    
}