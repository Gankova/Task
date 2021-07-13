package com.company;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// macCoffee() - абстрактный класс(можно свойства создавать)
    // on и of интерфейс (свойства нельзя, все методы неареализованные)

        //сортировка коллекции через итератор

        SortedList list = new SortedList();
        list.add(584);
        list.add(5);
        list.add(1008);
        list.add(85);
        list.add(-4);
        list.add(8);
        for (Integer e : list){
            System.out.println(e);
        }

        //try c ресурсами
        try (
                FileInputStream  f = new FileInputStream("1.txt");
                FileOutputStream f2 = new FileOutputStream("2.txt")
                ){
            f2.flush();
            f.reset();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
