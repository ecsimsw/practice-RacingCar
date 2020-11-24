package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private static final String ASK_CAR_NAME = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)";
    private static final String ASK_MOVE_CNT = "시도할 횟수는 몇회인가요?";

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String askCarName(){
        System.out.print(ASK_CAR_NAME);
        return readInputLine();
    }

    public static String askMoveCnt(){
        System.out.print(ASK_MOVE_CNT);
        return readInputLine();
    }

    private static String readInputLine() {
        String inputLine = "";
        try{
            inputLine = br.readLine();
        } catch (Exception e){
            e.printStackTrace();
        }
        return inputLine;
    }
}
