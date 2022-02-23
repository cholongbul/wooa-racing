package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

/**
 * packageName : racingcar
 * fileName : MoveCar
 * author : ohjm
 * date : 2022/02/22 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/02/22 ohjm 최초 생성
 */
public class MoveCar extends Thread{

    public Car run(Car car, int movecount){
            for (int i = 0; i < movecount; i++) {
                int randomcnt = Randoms.pickNumberInRange(0,9);
                System.out.println(randomcnt);
                if (randomcnt>=4) {
                    int position = car.getPosition();
                    car.setPosition(position + 1);
                    System.out.println(car.getName() +","+ Integer.toString(car.getPosition()));
                }
            }
           return car;
        }
}
