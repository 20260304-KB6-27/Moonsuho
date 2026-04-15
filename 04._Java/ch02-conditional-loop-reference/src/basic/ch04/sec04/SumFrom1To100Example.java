package basic.ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        //for문으로 sum구하기
       /* for (int i = 1; i <= 100; i++) {
            sum += i;
        }*/

        //while로 sum구하기
        int i=0;
        while(i<=100){
            sum += i;
            i++;
        }
        System.out.print("1~100까지 합: " + sum);
    }
}

