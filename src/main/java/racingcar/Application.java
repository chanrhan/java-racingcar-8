package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args){
        try {
            String carNames = Console.readLine();
            int maxMoveCount = Integer.parseInt(Console.readLine());

            RaceManager raceManager = new RaceManager(carNames, maxMoveCount);
            raceManager.start();
            raceManager.printWinners();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }



        Console.close();
    }
}
