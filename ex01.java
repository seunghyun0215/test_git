import java.sql.SQLOutput;

public class ex01 {

    public static void main(String[] args) {
        //3개의 정수를 10.11.12를 더하여 결과를 출력하세요
        int num1;   //정수형 변수 선언
        int num2;
        int num3;
      int sum;

        num1 = 10;
        num2 = 11;
        num3 = 12;


       sum = num1 + num2 + num3;

        System.out.println("10+11+12=" +  sum);
        System.out.println(num1 +"+"+num2+"+"+num3+"="+sum);
        System.out.printf("%d + %d +%d =%d" ,num1,num2,num3,sum);

    }
}
