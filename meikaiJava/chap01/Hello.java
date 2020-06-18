class Hello {

    /*

    - java
    객체지향 프로그래밍을 지원하는 프로그래밍 언어
    클래스를 이용한 캡슐화, 상속, 다형성 등
    예외처리 가능
    병행처리 가능
    패키지에 의한 클래스 분류

    - JDK
    java 개발 키트
    JDK : 컴파일러, 각종 툴
    JRE : java 실행환경, 각종 라이브러리(API)
    JVM : java 가상머신

    JDK < JRE < JVM >>

    - 소스 프로그램을 작성하여 소스 파일로 저장
    소스 파일 이름 : 클래스이름.java (대소문자 구분해야함)

    - 소스 파일을 컴파일(compile)해서 바이트코드(bytecode)로 된 클래스파일 생성 -> 생성된 클래스파일 내의 클래스 실행
    클래스이름.java ---javac커맨드---> 클래스이름.class ---java커맨드---> 출력

    * 참고 : cd(current directory) 현재 디렉토리
    * 참고 : dir 디렉토리에 있는 파일과 하위 디렉토리 목록
    * 참고 : mkdir 현재 디렉토리에 새로운 디렉토리 생성
    * 참고 : code . < vscode 실행할 때 사용하는 듯

    */

    public static void main(String[] args) {
        System.out.println("개념있는 java");
        System.out.println("meikai는 일본말로 명쾌라고 한다");
        System.out.println("shin meikai java nyumon...");
    }
}

/*
전통적인 주석 (traditional comment)
c언어의 주석과 같은 형식에서 유래(1970년대부터 사용) 
*/

/**
 * 문서화 주석 (documentation comment)
 * 이 형식으로 프로그램의 사양서가 되는 도큐먼트(문서)를 생성할 수 있음
*/

// 한줄 주석 (end of line comment)
// 전통적인 주석과 문서화 주석은 중복(주석안에 주석을 입력)사용 불가 > 컴파일 에러

// 코멘트 아웃 (comment out) 할때 주로 사용
// 프로그램으로서 입력되어 있는 부분을 주석으로 만드는 것 (임시)