import java.util.Random;

public class LuckyNo {

    /*
    난수의 생성

    - Random 클래스
    일련의 유사난수 생성
    nextBoolean() : Boolean형
    nextInt() : int형
    nextInt(n) : int형 / 0 ~ n-1
    nextLong() : long형
    nextDouble() : double형 / 0.0이상 1.0미만
    nextFloat() : float형 / 0.0이상 1.0미만

    */

    public static void main(String[] args) {
        Random rd = new Random();

        int lucky1 = rd.nextInt(46);
        double lucky2 = rd.nextDouble();

        System.out.println("오늘의 행운의 로또 숫자는 " + lucky1 + " !");
        System.out.println("오늘의 행운의 로또 숫자는 " + -lucky1 + " !");
        System.out.println("오늘의 행운의 로또 숫자는 " + lucky2 + " !");
    }
    
}