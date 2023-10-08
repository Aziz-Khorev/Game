package main.java.com.RockPaperScissors;

import java.util.Arrays;
import java.util.Scanner;

public class Field { // Мы создаем данный класс для хранения элементов

    private PlayerSymbol p1;
    private PlayerSymbol p2;

    public PlayerSymbol getP1() {
        return p1;
    }

    public PlayerSymbol getP2() {
        return p2;
    }

    public void setP1(PlayerSymbol p1) {
        this.p1 = p1;
    }

    public void setP2(PlayerSymbol p2) {
        this.p2 = p2;
    }

//    public void printBoard(){
//
//    }

    public Field() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Выберите предмет:");
//        System.out.println(" 1 - rock");
//        System.out.println(" 2 - paper");
//        System.out.println(" 3 - scissors");

//       String p1 = "выберите предмет: 1 - rock, 2 - paper, 3 - scissors";
//       String p2 = "выберите предмет: 1 - rock, 2 - paper, 3 - scissors";


    }}

//    public void printBoard(){
//        if (int i = p1 && i = p2;) {
//            System.out.println();
//        }
//    }

//for (int i = 0; i < )
//System.out.println(p1 + "Выберите предмет: 1 - rock, 2 - paper, 3 - scissors");
// нужно меню игрока - "введи цифру от 1-3: 1 - rock; 2 - paper; 3 - Scissors"
// на основание ввода генерим фигурку (одну из PlayerSymbol)
// потом к полю присваиваем к p1 его выбор, то что он сгенерил
// потом генерим в pcMove цифру от 0-2 и соотвественно внутри этого метода пишем "0 - rock, 1 - paper, 2 - scissors" -
// - соответсвенно получаем фигурку от компьютера и в поле p2 сэтиш вот это значение которое компьетер сгенирил
// после этого в методе checkWinner проверяешь состояние полей кто как походил и какой результат