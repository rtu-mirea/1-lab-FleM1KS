package com.company;

import java.util.ArrayList;

public class Arras {

    int length;
    int[] array;

    //Создание класса
    Arras(int length){
        this.length = length;
        array = new int[this.length];
    }

    // ввод в ручную
    public void mInput(){
        java.util.Scanner inp = new java.util.Scanner(System.in);
        System.out.println("Вводите числа массива: ");
        for (int i = 0; i<array.length; i++){
            array[i] = inp.nextInt();
        }
    }

    //рандомный ввод
    public void rInput(){
        for (int i=0; i<length; i++){
            array[i] = 1 + (int)(Math.random() * 1000);
        }
    }

    //вывод слева направо
    public void lOut(){
        for(int i = 0; i < length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    //вывод справа налево
    public void rOut(){
        for (int i = length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }

    //Task_1
    public void task_1(){
        System.out.println("Введите необхаодимое число: ");
        java.util.Scanner inp = new java.util.Scanner(System.in);
        int num = inp.nextInt();
        int count=0;
        for (int i =0; i<length; i++){
            int n = array[i];
            n/=(Math.pow(10,num));
            if (n!=0){
                count++;
                array[i] = n;
            }
        }
        System.out.println("Разрядность уменьшена у "+count+" чисел\n");
    }

   private boolean seh(int a){
        if (a<10)
            return false;

        while(a>0){
            if (a%16>9)
                return true;
            a/=16;
        }
        return false;
  }
//Task_2
   public int[] task_2(){
       int[] arr = new int[this.length];
       int count = 0;
       for (int i=0; i<length; i++){
           if (seh(array[i])){
               arr[count] = array[count];
               count++;
           }

       }

       int[] result = new int[count];
       for (int i=0; i<count; i++){
           result[i] = arr[i];
       }
       return result;

   }

}