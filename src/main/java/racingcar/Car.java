package racingcar;


/**
 * packageName : PACKAGE_NAME
 * fileName : Car
 * author : ohjm
 * date : 2022/02/22 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/02/22 ohjm 최초 생성
 */
public class Car {
    private final String name;
    private int position =0;

    public Car(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition(){return position;}

    public void setPosition(int position) {
        this.position = position;
    }
}
