package service;

import domain.Car;

import java.util.List;
import java.util.stream.Collectors;

public class ConsoleWriter {
    public static void printRaceStatus(List<Car> cars){
        cars.forEach(car->{
            System.out.printf("%s : %s\n", car.name, "-".repeat(car.position));
        });

        System.out.println();
    }

    public static void printWinners(List<Car> cars){
        List<String> carNames = cars.stream()
                .map(car->car.name)
                .collect(Collectors.toList());

        String resultString = String.join(",", carNames);

        System.out.printf("최종 우승자 : %s", resultString);
    }
}
