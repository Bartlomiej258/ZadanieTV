public class Televisor {
    boolean turn;

    void turnOn(){
        turn = true;
        System.out.println("the TV is On");
    }

    void turnOff(){
        turn = false;
        System.out.println("the TV is off");
    }

    void showStatus(){
        System.out.println("Status: the Tv is: " + turn);
    }
}
