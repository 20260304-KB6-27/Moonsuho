package lecture.exam01;

public class Worker extends Person implements Behavior {  // + name, age
    //추가적인 필드
    String companyName;
    String position;
    //먹고, 생활하는
    @Override
    public void eat() {
        System.out.println("구내식당에서 급식을 먹습니다.");
    }

    @Override
    public void live() { //OPENING_TIME => 기본적으로 this.OPENING_TIME을 가리킴 -> Person 을 보고 없으면 그때 Behavior에서 찾음
        System.out.println(/*Behavior.*/OPENING_TIME+"시부터"+Behavior.CLOSING_TIME+"시까지 근무합니다.");
    }

    @Override
    public void die(){
        System.out.println("일을 제대로 안하면 대표님이 죽일 것 같아요");
    }
}
