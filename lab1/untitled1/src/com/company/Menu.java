package com.company;

public class Menu {
    public void show_menu(){

        System.out.println("Введите размер массива: ");
        java.util.Scanner inp = new java.util.Scanner(System.in);
        int length = inp.nextInt();
        Arras arr = new Arras(length);

        String info_menu = "1. Ввести массив вручную\n2. Заполнить случайными числами\n" +
                "3. Вывести слева направо\n4. Вывести справа на лево\n" +
                "5. Задание 1\n" +
                "6. Задание 2\n" +
                "7. Выход из приложения\n";

        int num_menu;

        boolean job = true;
        while (job){
            System.out.print(info_menu);
            num_menu = inp.nextInt();
            switch (num_menu){
                case 1:
                    arr.mInput();
                    break;
                case 2:
                    arr.rInput();
                    break;
                case 3:
                    arr.lOut();
                    break;
                case 4:
                    arr.rOut();
                    break;
                case 5:
                    arr.task_1();
                    break;
                case 6:
                    int[]arrau_out = arr.task_2();
                    for (int i:arrau_out){
                        System.out.print(i+" ");
                    }
                    System.out.println();
                    break;
                case 7:
                    job = false;
                    break;
            }
        }
    }
}