package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Application {
    @DisplayName("실행")
    @Test
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input=Console.readLine();
        RacingCar racingCar;
        int n;
        try{
            racingCar=new RacingCar(input);
            System.out.println("시도할 회수는 몇회인가요?");
            input=Console.readLine();
            n= getTurn(input);
        }catch(IllegalArgumentException e) {
            System.out.println("잘못된 값이 입력되어서 종료합니다.");
            return;
        }
        racingCar.runRace(n);
        racingCar.printResult();
        return;
    }
    public static int getTurn(String input) {
        int n;
        try{
            n = Integer.parseInt(input);
        }catch(NumberFormatException e) {
            System.out.println("숫자가 아닌 다른 값이 입력되었습니다.");
            throw new IllegalArgumentException("에러 : 잘못된 횟수 입력");
        }
        return n;
    }
}
