package util;

import domain.Car;

import java.util.Arrays;
import java.util.List;

public class RaceUtil {
    public static List<Car> parseStringToCars(String str) {
        try {
            return Arrays.stream(str.split(","))
                    .map(Car::new)
                    .toList();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("문자열 파싱 과정에서 오류가 발생했습니다 : " + str);
        }
    }

    public static List<Car> getWinners(List<Car> cars) {
        int maxPosition = cars.stream()
                .max((car1,car2)-> car2.position - car1.position)
                .hashCode();

        return cars.stream()
                .filter(car->car.position == maxPosition)
                .toList();
    }
}
