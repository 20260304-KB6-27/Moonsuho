package lecture.before;


public class SMSSender extends EmailSender { //다형성을 위한 상속
    // 문자 보내는 기능
    @Override
    public void send(String messsage) {
        System.out.println("이메일 발송: " + messsage);
    }
}
