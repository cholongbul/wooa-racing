package racingcar;

import racingcar.domain.Car;
import racingcar.domain.CarFactory;
import racingcar.domain.Cars;
import racingcar.domain.Client;

import java.util.*;

/**
 * packageName : racingcar
 * fileName : Racing
 * author : ohjm
 * date : 2022/02/24 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/02/24 ohjm 최초 생성
 */
public class Racing {

    public void play(){
        CarFactory carFactory = new CarFactory();
        Client client = new Client();
        String[] carnames = client.CarNameInput();
        List<Car> carlist = new ArrayList<>();
        for(String carname : carnames) {
            carlist.add(carFactory.createCar(carname));
        }
        Cars cars = new Cars(carlist);
        int trycount = client.tryCountInput();
        client.partStrat();
        for (int i = 0; i < trycount; i++) {
           client.partResultPrint(cars);
        }
        List<Car> winners = cars.getWinners();
        if (winners.size()==1){
            client.winnerPrint(winners.get(0).getName());
        } else {
            client.winnersPrint(winners);
        }

    }
}
