package basic.ch08.sec04;

public class Television implements RemoteControl {

    private int volum; //TV음량

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void setVolum(int volum) {
        if(volum > RemoteControl.MAX_VOLUME){
            this.volum = RemoteControl.MAX_VOLUME;
        }else if(volum < RemoteControl.MIN_VOLUME){
            this.volum = RemoteControl.MIN_VOLUME;
        }

        System.out.println("현재 TV볼륨: "+this.volum);
    }
}
