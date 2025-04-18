package com.kivi.util;

import com.kivi.model.Filter;

import java.lang.reflect.Array;
import java.util.List;

public class Methods {
    /**
     * 1.	Напишите метод filter, который принимает на вход массив (любого типа) и реализацию интерфейса Filter
     * c методом boolean apply(T o), возвращает новый массив, убрав из исходного массива лишние элементы,
     * не удовлетворяющие фильтру. Метод apply возвращает истину, если входящий аргумент удовлетворяет фильтру,
     * и ложь в противном случае. При реализации использовать шаблоны интерфейсов и методов
     */
    public static <T> T[] filter(T[] array, Filter<T> filter){
       int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(filter.apply(array[i])){
                counter++;
            }
        }
        T[] filtered =(T[]) Array.newInstance(array.getClass().getComponentType(), counter);
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if(filter.apply(array[i])){
                filtered[k++] = array[i];
            }
        }
        return filtered;
    }
}
