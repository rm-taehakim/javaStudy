import java.util.Scanner;

public class PutAsteriskFor {

    /*
    for문(for statement)

    - for문
    for + (for의 초기화 부분; 식; for의 갱신 부분) + 문
    while문보다 짧게 프로그램을 작성할 수 있음


    - for의 초기화 부분(전처리)
    변수를 선언, 콤마(,)를 사용하여 복수 선언 가능, 여기서 선언한 변수는 for문 내에서만 이용 가능,
    다른 for문에서 동일한 이름의 변수를 사용하는 경우에 각 for문마다 선언을 해야 함,
    전처리에서 실행하는 것이 아니면 생략 가능
    

    - 식(제어식, 계속 조건)
    생략 가능, 생략한 경우 반복/계속의 판정은 항상 ture로 간주,
    break문과 return문을 loop body 내에서 실행하지 않는 한 영원히 반복되는 '무한 루프'
    

    - for의 갱신 부분(후처리)
    콤마(,)를 사용하여 복수의 식을 기술 가능, 아무것도 실행할 것이 없으면 생략 가능

    * 참고 : for에는 '~사이'라는 의미가 있음
    * 참고 : 반복문을 제어하는 변수로 i, j를 많이 사용하는 이유
    기술계산용 프로그래밍 언어 FORTRAN 에서 변수는 원칙적으로 실수이나, 이름의 첫 문자가 i,j,k,l,m,n 변수만은
    자동적으로 정수로 간주되었음, 따라서 반복을 제어하기 위한 변수로 i ~ n 을 사용하는 것이 가장 간단했음


    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("몇 개의 *를 표시할까 ? : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) // 변수 i를 0부터 시작해서 하나씩 증가시키면서 n번 loop body 반복
            System.out.println('*' + "\ni의 값(for문 내) : " + i);
            
        System.out.println("---"); // for문내에서 선언한 i는 여기선 사용 불가

        int j;
        for (j = 0; j < n; j++)
            System.out.println('*' + "\nj의 값(for문 내) : " + j);
        
        System.out.println("j의 최종 값 : " + j); // for문 밖에서 선언한 j는 여기선 사용 가능

        // n이 4일 경우, for문 내에서의 j의 마지막 값은 3이지만, for문을 빠져나온 j의 최종값은 4
        
        
    }

    
}