package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * packageName : racingcar.domain
 * fileName : Cars
 * author : ohjm
 * date : 2022/02/24 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/02/24 ohjm 최초 생성
 */
public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars){
        this.cars = cars;
    };

    public List<Car> getCars() {
        return cars;
    }

    public HashMap<String, Integer> getPositions() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (Car car : cars){
            map.put(car.getName(),car.getPosition());
        }
        return map;
    }

    public List<Car> getWinners(){
        HashMap<String, Integer> positions = this.getPositions();
        List<Car> winners= new ArrayList<>();
        int maxvalue = Collections.max(positions.values());
        for (Car car : this.cars){
            if (maxvalue == car.getPosition()){
                winners.add(car);
            }
        }
        return winners;
    }



}
