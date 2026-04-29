package basic.lecture.sec01;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void boxing() {
        //Box인스턴스
    }

    /*
     * 데이터 형식에 의존하지 않고 하나의 값이 여러 데이터 타입을 가질 수 있어
     * 재사용성이 높은 프로그래밍를 할 수 있다.
     */
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>(); //content의 타입은 String -> 컴파일 됐을때
        box1.content = "박스의 콘텐츠입니다.";

        //List<String> List = new ArrayList<>();

        System.out.println("box1.content = " + box1.content);

        Box<Integer> box2 = new Box<Integer>(); //content의 타입은 Integer -> 컴파일 됐을때
        box2.content = 100;
        System.out.println("box2.content = " + box2.content);
    }
}