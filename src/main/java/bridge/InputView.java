package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() throws IllegalArgumentException {
        String userInput = Console.readLine();
        if (userInput == null || !userInput.matches("^[0-9]{1,2}$")) {
            throw new IllegalArgumentException();
        }

        int convertedInput = Integer.parseInt(userInput);
        if (convertedInput < 3 || convertedInput > 20) {
            throw new IllegalArgumentException();
        }
        return convertedInput;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() throws IllegalArgumentException {
        String userInput = Console.readLine();
        if (userInput == null || !userInput.matches("^[U,D]$")) {
            throw new IllegalArgumentException();
        }
        return userInput;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        String userInput = Console.readLine();
        if (userInput == null | !userInput.matches("^[R,Q]$")) {
            throw new IllegalArgumentException();
        }
        return userInput;
    }
}
