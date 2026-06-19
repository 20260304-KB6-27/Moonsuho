package lecture.after;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 서비스 로직
@Service
public class NotiService {
    /*
    * 문제점
    * 1. 기존 클래스를 수정 -> NotiService의 내부 코드 변화가 일어나야함
    * */
    private final EmailSender emailSender;

    //private SMSSender smsSender = new SMSSender(); //강결합

    @Autowired
    private NotiService(EmailSender emailSender){
        this.emailSender = emailSender;
    }
    public void notify(String message) {

       // emailSender.send(message);
        emailSender.send(message);

    }
}
