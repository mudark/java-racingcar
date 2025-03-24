package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    String name;
    int distance;

    public Car(String name) {
        name=name.replaceAll(" ","");
        if(name.length()>5||name.length()<1) {
            System.out.println("자동차 이름은 1글자 이상, 5글자 이하여야 합니다.");
            throw new IllegalArgumentException("에러 : 자동차 이름 글자수 초과");
        }
        this.name=name;
        this.distance=0;
    }
    public void run() {
        if(Randoms.pickNumberInRange(0,9)>=4){
            this.distance++;
        }
    }
    public void print() {
        System.out.print(this.name+" : ");
        for(int i=0;i<distance;i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
