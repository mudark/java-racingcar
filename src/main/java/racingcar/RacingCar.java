package racingcar;

import static org.assertj.core.api.Assertions.*;

public class RacingCar {
    Car[] car;

    public RacingCar(String input) {
        String carName[] = input.split(",");
        this.car=new Car[carName.length];

        for(int i=0;i< carName.length;i++){
            this.car[i]=new Car(carName[i]);
            //assertThat(car[i].name.length()).isBetween(1,5);
            // 차 이름 글자수 확인
        }
    }
    public void runRace(int n) {
        for(int i=0;i<n;i++){
            this.runCars();
        }
    }
    public void runCars(){
        for(int i=0;i<this.car.length;i++) {
            car[i].run();
            car[i].print();
        }
        System.out.println();
    }
    public void printResult() {
        System.out.print("최종 우승자 : ");
        System.out.println(this.findWinner());
        System.out.println("경기가 종료되었습니다.");
    }
    public String findWinner() {
        int winnerDistance=0;
        for(int i=0;i<car.length;i++) {
            if(winnerDistance<car[i].distance) {
                winnerDistance=car[i].distance;
            }
        }
        String winnerList="";
        for(int i=0;i<car.length;i++) {
            if (winnerDistance == car[i].distance) {
                winnerList=winnerList.concat(car[i].name);
                winnerList=winnerList.concat(", ");
            }
        }
        return winnerList;
    }
}