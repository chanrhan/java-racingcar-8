package racingcar;

import java.util.List;

public class RaceManager {
    private final List<Car> cars;
    private final int maxMoveCount;

    public RaceManager(String carNameString, int maxMoveCount){
        this.cars = parseStringToCars(carNameString);
        this.maxMoveCount = maxMoveCount;
    }

    private List<Car> parseStringToCars(String str){
        return null;
    }

    public void start(){

    }

    private void move(){

    }

    public void printWinners(){

    }



}
