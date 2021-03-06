package eu.senla.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Rainbow {
   private final static String COLOR_1 = "красный";
    private final static String COLOR_2 = "оранжевый";
    private final static String COLOR_3 = "желтый";
    private final static String COLOR_4 = "зеленый";
    private final static String COLOR_5 = "голубой";
    private final static String COLOR_6 = "синий";
    private final static String COLOR_7 = "фиолетовый";
    private final static String MIXCOLOR_1 = "красно-";
    private final static String MIXCOLOR_2 = "оранжево-";
    private final static String MIXCOLOR_3 = "желто-";
    private final static String MIXCOLOR_4 = "зелено-";
    private final static String MIXCOLOR_6 = "сине-";
    private final static String MIXCOLOR_7 = "фиолетово-";


    void userInput() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("Введите номер цвета (0- для выхода из программы): ");
            int userColor = Integer.parseInt(reader.readLine());
            if(userColor == 0) break;
            else {
                if(userColor < 0 || userColor >= 100)
                    System.out.println("Неверный ввод. Диапазон ввода для простых цветов 1-7, для сложных цветов 10-77. Пожалуйста, повторите ввод.");
                if(userColor >= 10 && userColor < 100){
                    int userColor1 = userColor/10; //нахождение числа из разряда десятков
                    int userColor2 = userColor%10; //нахождение числа из разряда единиц
                    showNumToColor(userColor1,userColor2);//использование метода с 2 параметрами
                }
                if(userColor > 0 && userColor < 10)
                    showNumToColor(userColor);//использование метода с 1 параметром
            }
        }
    }

    void showNumToColor(int userColor) {
        switch (userColor) {
            case 1:
                System.out.println("Выбранный цвет - " + COLOR_1);
                break;
            case 2:
                System.out.println("Выбранный цвет - " + COLOR_2);
                break;
            case 3:
                System.out.println("Выбранный цвет - " + COLOR_3);
                break;
            case 4:
                System.out.println("Выбранный цвет - " + COLOR_4);
                break;
            case 5:
                System.out.println("Выбранный цвет - " + COLOR_5);
                break;
            case 6:
                System.out.println("Выбранный цвет - " + COLOR_6);
                break;
            case 7:
                System.out.println("Выбранный цвет - " + COLOR_7);
                break;
            default:
                System.out.println("Неверный ввод. Диапазон ввода для простых цветов 1-7");
        }
    }

    void showNumToColor(int userColor1, int userColor2) {
        int userColorMix = Integer.parseInt(String.valueOf(userColor1) + String.valueOf(userColor2)); //склейка двух цифр в число

        switch (userColorMix) {
            case 01:
                showNumToColor(1);
                break;
            case 10:
                showNumToColor(1);
                break;
            case 11:
                showNumToColor(1);
                break;
            case 12:
                System.out.println("Выбранный цвет - " + MIXCOLOR_1 + COLOR_2);
                break;
            case 13:
                System.out.println("Выбранный цвет - " + MIXCOLOR_1 + COLOR_3);
                break;
            case 14:
                System.out.println("Выбранный цвет - " + MIXCOLOR_1 + COLOR_4);
                break;
            case 15:
                System.out.println("Выбранный цвет - " + MIXCOLOR_1 + COLOR_5);
                break;
            case 16:
                System.out.println("Выбранный цвет - " + MIXCOLOR_1 + COLOR_6);
                break;
            case 17:
                System.out.println("Выбранный цвет - " + MIXCOLOR_1 + COLOR_7);
                break;
            case 02:
                showNumToColor(2);
                break;
            case 20:
                showNumToColor(2);
                break;
            case 22:
                showNumToColor(2);
                break;
            case 21:
                showNumToColor(1,2);
                break;
            case 23:
                System.out.println("Выбранный цвет - " +MIXCOLOR_2 + COLOR_3);
                break;
            case 24:
                System.out.println("Выбранный цвет - " + MIXCOLOR_2 + COLOR_4);
                break;
            case 25:
                System.out.println("Выбранный цвет - " + MIXCOLOR_2 + COLOR_5);
                break;
            case 26:
                System.out.println("Выбранный цвет - " + MIXCOLOR_2 + COLOR_6);
                break;
            case 27:
                System.out.println("Выбранный цвет - " + MIXCOLOR_2 + COLOR_7);
                break;
            case 03:
                showNumToColor(3);
                break;
            case 30:
                showNumToColor(3);
                break;
            case 33:
                showNumToColor(3);
                break;
            case 31:
                showNumToColor(1,3);
                break;
            case 32:
                showNumToColor(2,3);
                break;
            case 34:
                System.out.println("Выбранный цвет - " + MIXCOLOR_3 + COLOR_4);
                break;
            case 35:
                System.out.println("Выбранный цвет - " + MIXCOLOR_3 + COLOR_5);
                break;
            case 36:
                System.out.println("Выбранный цвет - " + MIXCOLOR_3 + COLOR_6);
                break;
            case 37:
                System.out.println("Выбранный цвет - " + MIXCOLOR_3 + COLOR_7);
                break;
            case 04:
                showNumToColor(4);
                break;
            case 40:
                showNumToColor(4);
                break;
            case 44:
                showNumToColor(4);
                break;
            case 41:
                showNumToColor(1,4);
                break;
            case 42:
                showNumToColor(2,4);
                break;
            case 43:
                showNumToColor(3,4);
                break;
            case 45:
                System.out.println("Выбранный цвет - " + MIXCOLOR_4 + COLOR_5);
                break;
            case 46:
                System.out.println("Выбранный цвет - " + MIXCOLOR_4 + COLOR_6);
                break;
            case 47:
                System.out.println("Выбранный цвет - " + MIXCOLOR_4 + COLOR_7);
                break;
            case 05:
                showNumToColor(5);
                break;
            case 50:
                showNumToColor(5);
                break;
            case 55:
                showNumToColor(5);
                break;
            case 51:
                showNumToColor(1,5);
                break;
            case 52:
                showNumToColor(2,5);
                break;
            case 53:
                showNumToColor(3,5);
                break;
            case 54:
                showNumToColor(4,5);
                break;
            case 56:
                System.out.println("Выбранный цвет - " + MIXCOLOR_6 + COLOR_5);
                break;
            case 57:
                System.out.println("Выбранный цвет - " + MIXCOLOR_7 + COLOR_5);
                break;
            case 06:
                showNumToColor(6);
                break;
            case 60:
                showNumToColor(6);
                break;
            case 66:
                showNumToColor(6);
                break;
            case 61:
                showNumToColor(1,6);
                break;
            case 62:
                showNumToColor(2,6);
                break;
            case 63:
                showNumToColor(3,6);
                break;
            case 64:
                showNumToColor(4,6);
                break;
            case 65:
                showNumToColor(5,6);
                break;
            case 67:
                System.out.println("Выбранный цвет - " + MIXCOLOR_6  + COLOR_7);
                break;
            case 07:
                showNumToColor(7);
                break;
            case 70:
                showNumToColor(7);
                break;
            case 77:
                showNumToColor(7);
                break;
            case 71:
                showNumToColor(1,7);
                break;
            case 72:
                showNumToColor(2,7);
                break;
            case 73:
                showNumToColor(3,7);
                break;
            case 74:
                showNumToColor(4,7);
                break;
            case 75:
                showNumToColor(5,7);
                break;
            case 76:
                showNumToColor(6,7);
                break;
            default:
                System.out.println("Неверный ввод. Диапазон ввода для сложных цветов 10-77");
        }
    }
}