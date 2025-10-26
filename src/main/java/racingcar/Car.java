package racingcar;

import java.util.Random;

public class Car  {
    public String name;
    public int pos=0;

    public Car(String name){
        this.name=name;
    }

    private boolean canMove(){
        Random random = new Random();
        return random.nextInt(0, 10) >= 4;
    }

    public void tryMove(){
        if(canMove()){
            pos+=1;
        }
    }

    public void printCurrentPosition(){
        System.out.printf("%s : %s\n", name, "-".repeat(pos));
    }
}
