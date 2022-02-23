package racingcar;

import camp.nextstep.edu.missionutils.Console;

/**
 * packageName : racingcar
 * fileName : InputText
 * author : ohjm
 * date : 2022/02/22 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/02/22 ohjm 최초 생성
 */
public class ReadLine {

    public String[] carName(){

        String inputCarStr = Console.readLine();
        String[] carnames = inputCarStr.split(",");
        return carnames;
    }

    public  int count(){

        int inputCount = Integer.valueOf(Console.readLine());
        return inputCount;
    }
}
