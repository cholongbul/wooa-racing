package racingcar;

/**
 * packageName : racingcar
 * fileName : ThreadTest
 * author : ohjm
 * date : 2022/02/22 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/02/22 ohjm 최초 생성
 */
public class ThreadTest extends Thread{

    public void run(Car car){
        String bar = "";
        for (int i = 0; i < car.getPosition(); i++) {
            bar = bar + "-";
        }
        System.out.println(car.getName()+" : " + bar);
    }
}
