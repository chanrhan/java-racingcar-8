package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String carNames = Console.readLine();
        int maxMoveCount = Integer.parseInt(Console.readLine());

        RaceManager raceManager = new RaceManager(carNames, maxMoveCount);
        raceManager.start();
        raceManager.printWinners();


        Console.close();
    }
}
