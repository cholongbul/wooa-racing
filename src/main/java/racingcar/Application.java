package racingcar;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;


/**
 * packageName : PACKAGE_NAME
 * fileName : Application
 * author : ohjm
 * date : 2022/02/22 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/02/22 ohjm 최초 생성
 */
public class Application {

    public static void main(String[] args) {
        Carmaker carmaker = new Carmaker();
        ReadLine readLine = new ReadLine();
        String[] carnames = readLine.carName();
        int moveCount = readLine.count();
        List<Car> carlist = carmaker.inputCarName(carnames);
        MoveCar mvcar = new MoveCar();
        mvcar.run()


    }
}
