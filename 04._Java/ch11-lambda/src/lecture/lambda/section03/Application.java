package lecture.lambda.section03;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

public class Application {
    public static void main(String[] args) {
        /*
        * 매소드 참조
        * - 함수형 인터페이스를 람다식이 아닌 일반 메소드를 참조시켜서 선언하는 방법
        * - 람다식 대신에 이미 만들어져있는 메소드를 연결해서 쓰는 방법
        *
        * 클래스 이름::매소드 이름
        * 참조변수이름::매소드 이름
        *
        * */

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("css");


        /*
        * 일반 메소드를 참조할 때
        * - 함수형 인터페이스의 매개변수 타입/갯수/반환형과
        * - 일반 메소드의 매개변수 타입/갯수/반환형이 같아야함.
        * */
        Function<String, String> function = (str) -> str.toUpperCase();

        Consumer<String> consumer = (str) -> System.out.println(str);

        subjects.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
