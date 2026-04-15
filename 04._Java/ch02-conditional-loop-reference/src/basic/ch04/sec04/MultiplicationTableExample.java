package basic.ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for(int i=2;i<10;i++){
            System.out.println("***"+i+"단"+"***");
            for(int j=1;j<10;j++){

                int mul = i*j;
                System.out.println(i+" x "+j+" = "+ mul);
            }
        }
    }
}
