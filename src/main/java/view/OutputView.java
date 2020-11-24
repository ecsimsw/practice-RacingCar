package view;

public class OutputView {
    private static final String INPUT_ERROR_MSG = "올바르지 않은 입력 값입니다.";

    public static void announceWrongInput(){
        System.out.println(INPUT_ERROR_MSG);
    }
}
