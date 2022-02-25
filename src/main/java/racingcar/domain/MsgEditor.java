package racingcar.domain;

import java.util.HashMap;

/**
 * packageName : racingcar.domain
 * fileName : MsgEditor
 * author : ohjm
 * date : 2022/02/24 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/02/24 ohjm 최초 생성
 */
public class MsgEditor {

    public String barEditor(HashMap<String, Integer> carposition, String name){
        StringBuilder bar = new StringBuilder();
        for (int j = 0; j < carposition.get(name); j++) {
            bar.append("-");
        }

        return bar.toString();
    }

    public String partResultMsg(Cars cars){
        HashMap<String,Integer> carposition = new HashMap<String, Integer>();
        for (Car car: cars.getCars()){
            car.move();
            carposition.put(car.getName(),car.getPosition());
        }
        StringBuilder partmsg = new StringBuilder();
        for (String name : carposition.keySet()){
            String bar = barEditor(carposition,name);
            partmsg.append(name).append(" : ").append(bar).append("\n");
        }
        return partmsg.toString();
    }
}
