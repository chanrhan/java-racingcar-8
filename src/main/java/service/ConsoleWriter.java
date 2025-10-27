package service;

import domain.Car;

import java.util.List;
import java.util.stream.Collectors;

// 콘솔에 결과값을 출력하는 클래스
public class ConsoleWriter {
    // Race 의 각 차수마다 경주 현황을 터미널에 출력하는 함수
    public static void printRaceStatus(List<Car> cars) {
        cars.forEach(car -> {
            System.out.printf("%s : %s\n", car.name, "-".repeat(car.position));
        });

        System.out.println();
    }

    // 우승자 목록을 터미널에 출력하는 함수
    public static void printWinners(List<Car> cars) {
        List<String> carNames = cars.stream()
                .map(car -> car.name)
                .collect(Collectors.toList());

        String resultString = String.join(",", carNames);

        System.out.printf("최종 우승자 : %s", resultString);
    }
}
