package main.java.com.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

import static main.java.com.RockPaperScissors.PlayerSymbol.*;

public class VersusPCGameLogicImpl implements GameLogic { // Данный класс имплементирует интерфейс GameLogic

    private final Field field = new Field();     // Создаем поле для игры
    private final Scanner scanner = new Scanner(System.in); // создаем сканнер для того чтобы получать данные от нашего пользователя на вход
    private final Random random = new Random();

    private PlayerSymbol HUMAN_SYMBOL = R.P.S; // Не знаю можно так, но пытаюсь обратиться через HUMAN_SYMBOL сразу к трем предметам
    private PlayerSymbol PC_SYMBOL = R.P.S; // тоже самое и тут, только для компьютера

    public Field getField() {         // пытаюсь создать поле для двух игроков. Например чтобы была менюшка с предметами -
        if(int i = 0; i<3; i++){      // - тоесть например: 1 - камень, 2 - ножницы, 3 - бумага
            System.out.println(field + "Выберите предмет");   // получается так, игрок выбрал предмет, потом ПК рандомный выбирает и мы
        }else                                                // получаем либо выиграш либо проигрыш
        System.out.println("Выберите предмет из списка!");
        return field;
    }

    private boolean checkWinner(PlayerSymbol symbol) {
        PlayerSymbol symbols = field.getStorage();

        System.out.println("Компьтер сделал ход: " + PC_SYMBOL);
        if (HUMAN_SYMBOL.equals(PC_SYMBOL)) {
            System.out.println("Ничья");
        }

        else if (HUMAN_SYMBOL.equals(R)) {
            if (PC_SYMBOL.equals(P)) {
                System.out.println("Ты проиграл");

            } else if (PC_SYMBOL.equals(S)) {
                System.out.println("Ты выиграл");
            }
        }

        else if (HUMAN_SYMBOL.equals(P)) {
            if (PC_SYMBOL.equals(R)) {
                System.out.println("Ты выиграл");

            } else if (PC_SYMBOL.equals(S)) {
                System.out.println("Ты проиграл");
            }
        }

        else if (HUMAN_SYMBOL.equals(S)) {
            if (PC_SYMBOL.equals(P)) {
                System.out.println("Ты выиграл");

            } else if (PC_SYMBOL.equals(R)) {
                System.out.println("Ты проиграл");
            }
        }
        return false;
    }


    private boolean validateMove(int position) { // int position - это
        // метод который принимает позицию которая была выбрана игроком

    }

    private void humanMove() { // Метод для ввода данных от пользователя
        int position;
        while(true) {
            System.out.println("Ход игрока " + );
        }
    }

    private void pcMove() {

    }

    @Override
    public void play() {
        PlayerSymbol currentPlayer = HUMAN_SYMBOL; // Кто сейчас ходит первым
        while (true) {
            field.printBoard();  // печатаем доску
            if (currentPlayer == HUMAN_SYMBOL) {
                humanMove();

                if (checkWinner(HUMAN_SYMBOL)) {
                    System.out.println("Player " + HUMAN_SYMBOL.getValue() + " won!!!");
                    break;
                }
            }

            if (currentPlayer == PC_SYMBOL) {
                System.out.println("PC move");

                pcMove();

                if (checkWinner(PC_SYMBOL)) {
                    System.out.println("Player " + PC_SYMBOL.getValue() + " won!!!");
                    break;
                }
            }
        }
    }
}