import java.util.Scanner;

public class HelloNext {

    /*
    문자열 입력

    - 문자열은 String형으로 나타냄
    - String형은 기본형이 아닌 '클래스'에 의해 구현되는 특수한 형
    - String형을 초기화 후 대입(값을 변경) 할 경우, 내용을 수정하는 것이 아니라 참조할 곳을 수정하는 것


    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("이름 : ");
        String st1 = sc.next(); //공백과 탭을 문자열의 끝으로 간주함

        System.out.println("어서와 " + st1 + "씨! 여기는 처음이지?");

        /*
        System.out.println("이름 : ");
        String st2 = sc.nextLine(); //공백을 포함한 문자열(한 줄) 입력 가능
        
        System.out.println("어서와 " + st2 + "씨! 요기는 처음이지?");

        nextLine() 다음에 next()를 할 경우 입력창이 뜨지만,
        next() 다음에 nextLine()를 할 경우 입력창이 뜨지 않음 
        왜지.........?
        앞서 next()입력창에서 Enter를 누름으로써 입력이 끝났다고 인식하는걸까?
        */

        System.out.println("성 : ");
        String st3 = sc.next();
        System.out.println("이름 : ");
        String st4 = sc.next();

        System.out.println("어서와 " + st3 + st4 + "씨! 저기는 처음이지?");

        

        String s1 = "ABC"; 
        String s2 = "DEF";

        s1 = "XYZ";

        System.out.println("문자열 s1는 " + s1 + " 이다");
        System.out.println("문자열 s2는 " + s2 + " 이다");
    }
    
}