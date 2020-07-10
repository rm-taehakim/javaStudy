import java.util.Scanner;

public class ReverseNo {
    
    /*

    - 복합대입연산자(compound assignment operator)
    '연산'과 '대입' 두 가지 역할을 하는 연산자들
    *=, /=, %=, +=, -=, <<=, >>=, >>>=, &=, ^=, |=

    
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("양의 정숫값을 역순으로 표시해보자");
        
        int x;
        do {
            System.out.println("양의 정숫값 : ");
            x = sc.nextInt();
        } while (x <= 0);

        System.out.println("입력한 값을 역순으로 표시하면 ? ");
        while (x > 0) {
            System.out.print(x % 10); // x를 10으로 나눈 나머지를 표시 = 최하위 자릿수를 표시
            x /= 10; // x를 10으로 나눔 = 최하위 자릿수 버림
        }
        System.out.println();
        System.out.println("최종 x의 값은 : " + x); // x의 값이 0이 되면 while문 종료


    /*

    장점 1 : 실행해야 할 연산을 간결하게 표시할 수 있음
    장점 2 : 좌변의 변수명을 한 번만 쓰면 됨
    장점 3 : 좌변의 평가를 한 번만 실행함 (복잡한 프로그램에서 효과적)
    
    ex) 복합대입연산자를 이용하지 않을 경우 
    ++i;
    comp.memory[vec[i]] = com.memory[vec[i]] + 10;

    ex) 복합대입연산자를 이용할 경우
    comp.memory[ver[++i]] += 10;
    

    */

        System.out.println("1부터 n까지의 합 계산");

        int n;
        do {
            System.out.print("n의 값 : ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0; // 합계
        int i = 1;

        while (i <= n) {
            sum += i; // sum에 i를 더함
            i++; // i를 증가
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum);
        System.out.println("최종 i의 값은 " + i); // n+1


    }

}
