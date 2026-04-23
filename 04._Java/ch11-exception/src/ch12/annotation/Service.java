package ch12.annotation;

public class Service {
    @PrintAnnotation //둘다 기본값
    public void method1(){
        System.out.println("실행 내용1");
    }
    @PrintAnnotation("*") //vlaue = "*" number는 기본값
    public void method2(){
        System.out.println("실행 내용1");
    }
    @PrintAnnotation(value = "*",number = 20) //value = "*" number=20
    public void method3(){
        System.out.println("실행 내용1");
    }
}
