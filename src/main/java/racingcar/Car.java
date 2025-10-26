package racingcar;

public class Car {
    public String name;
    public int pos=0;

    public Car(String name){
        this.name=name;
    }

    private boolean canMove(){
        return false;
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
