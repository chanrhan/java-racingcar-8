package domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    public String name;
    public int position = 0;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    public void move() {
        if (canMove()) {
            position += 1;
        }
    }

    private void validateName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("자동자 이름은 빈 값일 수 없습니다!");
        }

        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자 이하만 가능합니다. : " + name);
        }
    }

    private boolean canMove() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }

}
