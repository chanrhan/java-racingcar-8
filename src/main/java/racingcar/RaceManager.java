package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RaceManager {
    private final List<Car> cars;
    private final int maxMoveCount;

    public RaceManager(String carNameString, int maxMoveCount){
        this.cars = parseStringToCars(carNameString);
        this.maxMoveCount = maxMoveCount;
    }

    private List<Car> parseStringToCars(String str){
        return Arrays.stream(str.split(str, ','))
                .map(Car::new)
                .toList();
    }

    public void start(){

    }

    private void move(){

    }

    private void printCurrentRaceStatus(){
        for(Car car:cars){
            car.printCurrentPosition();
        }
    }

    private String[] getWinners(){
        return null;
    }

    public void printWinners(){
        String winners = String.join(",", getWinners());
        System.out.printf("최종 우승자 : %s", winners);
    }



}
