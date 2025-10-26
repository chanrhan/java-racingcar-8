package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RaceManager {
    private final List<Car> cars;
    private final int maxMoveCount;

    public RaceManager(String carNameString, int maxMoveCount){
        this.cars = parseStringToCars(carNameString);
        this.maxMoveCount = maxMoveCount;
    }

    private List<Car> parseStringToCars(String str){
        try {
            return Arrays.stream(str.split(","))
                    .map(Car::new)
                    .toList();
        }catch (IllegalArgumentException e){
            throw new IllegalArgumentException("문자열 분리 과정에서 오류가 발생했습니다 : " + str);
        }
    }

    public void start(){
        for(int i=0;i<maxMoveCount;++i){
            move();
            printCurrentRaceStatus();
        }
    }

    private void move(){
        for (Car car : cars){
            car.tryMove();
        }
    }

    private void printCurrentRaceStatus(){
        for(Car car:cars){
            car.printCurrentPosition();
        }
        System.out.println();
    }

    private List<String> getWinners(){
        return null;
    }

    public void printWinners(){
        String winners = String.join(",", getWinners());
        System.out.printf("최종 우승자 : %s", winners);
    }



}
