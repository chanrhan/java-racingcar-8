package service;

import domain.Car;
import util.RaceUtil;

import java.util.List;

public class RaceService {
    private final List<Car> cars;
    private final int maxMoveCount;

    public RaceService(String carNameString, int maxMoveCount) {
        this.cars = RaceUtil.parseStringToCars(carNameString);
        this.maxMoveCount = maxMoveCount;
    }

    public void start() {
        for (int i = 0; i < maxMoveCount; ++i) {
            move();
        }
        ConsoleWriter.printWinners(RaceUtil.getWinners(cars));
    }

    private void move() {
        cars.forEach(Car::move);

        ConsoleWriter.printRaceStatus(cars);
    }




}
