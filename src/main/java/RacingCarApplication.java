import controller.RaceController;
import domain.InputValidator;
import view.InputView;
import view.OutputView;

public class RacingCarApplication {
    public static void main(String[] args ){

    }

    private void play(){
        String carNameInputLine = InputView.askCarName();
        if(!InputValidator.isValidNameInputLine(carNameInputLine)){
            OutputView.announceWrongInput();
            return;
        }

        String moveCntInputLine = InputView.askMoveCnt();
        if(!InputValidator.isValidMoveCnt(moveCntInputLine)){
            OutputView.announceWrongInput();
            return;
        }
    }

}
