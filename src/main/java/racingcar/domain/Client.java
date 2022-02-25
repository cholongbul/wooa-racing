package racingcar.domain;


import camp.nextstep.edu.missionutils.Console;
import racingcar.exception.MyRacingException;

import java.util.HashMap;
import java.util.List;

/**
 * packageName : racingcar.domain
 * fileName : Client
 * author : ohjm
 * date : 2022/02/24 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/02/24 ohjm 최초 생성
 */
public class Client {

    public void partStrat(){
        System.out.println("실행 결과");
    }

    public void partResultPrint(Cars cars){
        MsgEditor msgEditor = new MsgEditor();
        String partmsg = msgEditor.partResultMsg(cars);
        System.out.println(partmsg);
    }
    public void winnerPrint(String winner){
        System.out.println("최종 우승자 : " + winner);
    }
    public void winnersPrint(List<Car> winners){
        StringBuilder winnersStr = new StringBuilder();
        winnersStr.append("최종 우승자 : ");
        int winnersSize = winners.size() -1 ;
        for (Car winner : winners){
            winnersStr.append(winner.getName());
            if(winner != winners.get(winnersSize)){
                winnersStr.append(", ");
            }

        }

        System.out.println(winnersStr.toString());
    }
    public String[] CarNameInput(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] carnames = Console.readLine().split(",");
        for (String carname:carnames){
            if (carname.length()  > 5){
                System.out.println("[ERROR] 이름이 너무 깁니다.");
            }
        }

        return carnames;

    }
    public int tryCountInput(){
        System.out.println("시도할 회수는 몇회인가요?");
        int tryCount = Integer.parseInt(Console.readLine());
        return tryCount;
    }
}
