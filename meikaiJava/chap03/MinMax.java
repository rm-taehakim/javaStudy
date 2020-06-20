import java.util.Scanner;

public class MinMax {

     /*

    - 알고리즘(algorithm)
    '처리의 흐름'을 정의한 규칙
    문제를 해결하기 위해 명확하게 정의되고 순서가 정해진 유한한 개수를 갖는 규칙으로 이루어진 집합
    *** 아무리 분명하게 기술되어 있더라도 변수의 값에 따라서 문제가 풀리기도 하고 풀리지 않기도 하는 것은 
    정확한 알고리즘이라고 할 수 없음 ***


    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수 a : ");
        int a = sc.nextInt();
        System.out.println("정수 b : ");
        int b = sc.nextInt();
        System.out.println("정수 c : ");
        int c = sc.nextInt();

        int max = a;
        
        if (b > max)
            max = b;
        if (c > max)
            max = c;

        System.out.println("최댓값은 " + max + " 이다");

        
        int sec = a;
        
        if ((a > b && a < c) || (a > c && a < b))
            sec = a;
        if ((b > a && b < c) || (b > c && b < a))
            sec = b;
        if ((c > a && c < b) || (c > b && c < a))
            sec = c;
            
        System.out.println("중간값은 " + sec + " 이다");


    /*

    - 블록(block)
    단일한 문이 요구되는 장소에서 복수의 문을 실행해야 할 경우에는 그것들을 모아서 블록으로 구현
    블록 안에 입력할 수 있는 문은 블록문(block statement)로 한정
    블록문 : 일반적인 문에 '지역변수 선언문', '클래스선언'을 포함한 것

    *** if문에서 else는 가장 가까운 if와 대응됨 ***
    ex) if (a == 1)
            if (b == 1)
                문1 //a가 1이고, b도 1인 경우
            else
                문2 //a가 1이고, b가 1이 아닌 경우
    
    ex) if (a == 1) {
            if (b == 1)
                문1 //a가 1이고, b도 1인 경우
        } 
        else
            문2 //a가 1이 아닌 경우


    */
        
        System.out.println("정수 d : ");
        int d = sc.nextInt();
        System.out.println("정수 e : ");
        int e = sc.nextInt();

        int min1, max1;
        
        if (d < e) {
            min1 = d;
            max1 = e;

        } // {}블록이 없다면 if (d < e) min1 = d; 부분은 if문으로 간주되고 max1 = e; 부분은 식문
        else { //else는 if와 대응하지 않기 때문에 컴파일 에러(else앞에 오는 문이 if문이 아니라 식문이기 때문)
            min1 = e;
            max1 = d;
        }

        System.out.println("값이 작은 쪽은 " + min1 + " 이다");
        System.out.println("값이 큰 쪽은 " + max1 + " 이다");
    
        
    /*
    
    - 정렬(sort)
    최솟값이 위로 오는 오름차순 정렬, 최댓값이 위로 오는 내림차순 정렬

    */

        if (d > e) {
            int t = d; //블록 내에서만 이용할 변수는 그 블록 내에서 선언
            d = e;
            e = t;
        }

        System.out.println("입력한 값의 오름차순 정렬");
        System.out.println("변수 1번은 " + d + " 가 되고");
        System.out.println("변수 2번은 " + e + " 가 된다");
        

        int min2, max2;

        if (d == e) {
            System.out.println("값이 같다");
        }
        else if (d < e) {
            min2 = d;
            max2 = e;
            System.out.println("작은 값 " + min2 + ", 큰 값 " + max2);
            }
            else {
                min2 = e;
                max2 = d;
                System.out.println("작은 값 " + min2 + ", 큰 값 " + max2);
            }
            
    }
    
}