package main.java.com.RockPaperScissors;

public class AppRunner {
    public static void main(String[] args) {
        GameLogic gameLogic = new VersusPCGameLogicImpl(); //Изза того что класс VersusPCGameLogicImpl имплементирует
        // интерфейс GameLogic, то изза этого теперь в нашем AppRunner мы говорим, что
        // GameLogic равен VersusPCGameLogicImpl
        gameLogic.play();
    }
}
