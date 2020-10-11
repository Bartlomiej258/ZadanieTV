public class Televisor {
    boolean isOn;

    void turnOn(){
        isOn = true;
        System.out.println("the TV is On");
    }

    void turnOff(){
        isOn = false;
        System.out.println("the TV is off");
    }

    void showStatus(){
        System.out.println("Status: the Tv is: " + isOn);
    }
}
