public class Sum {

    public static void main(final String[] args) {

        /* 
        연산결과 출력

        System.out.println() 의 괄호안에 
        57 정수를 기입하면 정수 리터럴(수치 57), "57" 문자열을 기입하면 문자열 리터럴(문자 5와7의 나열)
        
        */

        System.out.println(57 + 32);


        /* 
         
        '문자열 + 수치' 또는 '수치 + 문자열'의 연산에서는 수치가 문자열로 변환된 후에 연결되어 문자열이 출력됨
        + 연산은 왼쪽부터 순차적으로 실행됨 (오른쪽부터 실행되는 연산도 있음)
        ()괄호가 있을 경우 ()부터 우선 실행됨

        */
        
        System.out.println("57 + 32 = " + 57 + 32); //5732
        System.out.println("57 + 32 = " + (57 + 32)); //89


        // ()가 필요없다고 해서 ()를 생략하거나 남용하면 가독성이 떨어짐, 상황에 맞게 적절하게 사용

        System.out.println(57 + 32 + " 는 57과 32의 합입니다.");
        System.out.println((57 + 32) + " 는 57과 32의 합입니다.");


        // '문자열 + 수치' 는 가능, '문자열 - 수치' 는 불가능

        System.out.println("57 - 32 = " + (57 - 32));
        // System.out.println("57 - 32 = " + 57 - 32); > 에러

        
    }
    
    
}