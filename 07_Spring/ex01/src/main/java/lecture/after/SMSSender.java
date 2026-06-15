package lecture.after;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //동일한 타입의 여러번 중에 우선 주입
public class SMSSender {
    // 문자 보내는 기능
    public void send(String messsage) {
        System.out.println("이메일 발송: " + messsage);
    }
}
