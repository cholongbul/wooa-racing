package racingcar;

import java.util.ArrayList;
import java.util.List;


/**
 * packageName : PACKAGE_NAME
 * fileName : Input
 * author : ohjm
 * date : 2022/02/22 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/02/22 ohjm 최초 생성
 */
public class Carmaker {

    public List<Car> inputCarName(String[] carnames){
        List<Car> carlist = new ArrayList<>();
       for (String carname: carnames) {
           Car car = new Car(carname);
           carlist.add(car);
       }

       return carlist;
    }


}
