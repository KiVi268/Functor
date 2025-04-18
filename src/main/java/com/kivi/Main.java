package com.kivi;

import com.kivi.model.Filter;
import com.kivi.util.Methods;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 1.	Напишите метод filter, который принимает на вход массив (любого типа) и реализацию интерфейса Filter
         * c методом boolean apply(T o), возвращает новый массив, убрав из исходного массива лишние элементы,
         * не удовлетворяющие фильтру. Метод apply возвращает истину, если входящий аргумент удовлетворяет фильтру,
         * и ложь в противном случае. При реализации использовать шаблоны интерфейсов и методов
         */

        /**
         * 1.	На массиве целых чисел произвести фильтрацию и удаление
         * •	Положительных чисел, используя реализацию интерфейса через класс
         * •	Чисел, равных заданному числу с клавиатуры, используя анонимный внутренний класс
         * •	Четных чисел, используя лямбда выражение
         */

        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);
        int filterNum = scanner.nextInt();
        Filter<Integer> filter = new Filter<Integer>() {
            @Override
            public boolean apply(Integer o) {
                return o.equals(filterNum);
            }
        };


        Integer[] array = {1,2,3,4,5,4,6,7,8,4,9};
        System.out.println(Arrays.toString(Methods.filter(array, filter)));




    }
}