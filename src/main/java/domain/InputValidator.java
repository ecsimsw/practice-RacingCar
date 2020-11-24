package domain;

public class InputValidator {

    public static boolean isValidNameInputLine(String nameInputLine){
        if(isContainEmptyName(nameInputLine)){
            return false;
        }
        return true;
    }

    private static boolean isContainEmptyName(String inputLine){
        String[] names = inputLine.split(",");
        for(String name : names){
            if(name.equals("")){
                return true;
            }
        }
        return false;
    }

    public static boolean isValidMoveCnt(String moveCntInputLine){
        if(!isDigit(moveCntInputLine)){
            return false;
        }
        return true;
    }

    private static boolean isDigit(String inputLine){
        try{
            Integer.parseInt(inputLine);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
