package racingcar;

import java.util.Random;

public class Car {
    public String name;
    public int pos = 0;

    public Car(String name) {
        if(name.isEmpty()){
            throw new IllegalArgumentException("자동자 이름은 빈 값일 수 없습니다!");
        }

        if(name.length() > 5){
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다. : " + name);
        }
        this.name = name;
    }

    private boolean canMove() {
        Random random = new Random();
        return random.nextInt(0, 10) >= 4;
    }

    public void tryMove() {
        if (canMove()) {
            pos += 1;
        }
    }

    public void printCurrentPosition() {
        System.out.printf("%s : %s\n",
                name,
                "-".repeat(pos));
    }
}
