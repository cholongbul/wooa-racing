package racingcar.domain;

/**
 * packageName : racingcar.domain
 * fileName : CarFactory
 * author : ohjm
 * date : 2022/02/24 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/02/24 ohjm 최초 생성
 */
public class CarFactory {

    public  Car createCar(String name){
        return new Car(name);
    }
}
