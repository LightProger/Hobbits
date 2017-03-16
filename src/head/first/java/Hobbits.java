package head.first.java;

public class Hobbits {

        // Переменные
         String name;

         public static void main(String[] args) {

        // Создаем массив хоббитов
        Hobbits[] h = new Hobbits[3];

        // Создаем объекты - хобиты
        for (int i = 0; i < h.length; i++) {
            h[i] = new Hobbits();
        }

        // Присваиваем имя каждому элементу массива
        h[0].name = "Бильбо";
        h[1].name = "Фродо";
        h[2].name = "Сэм";

        // С помощью цикла выводим имена на печать
        int z = 0;
        while (z < h.length) {
            System.out.print(h[z].name + " -");
            System.out.println(" имя хорошего хоббита");
            z += 1;
        }
    }
}