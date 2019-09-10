package com.osp.utils;

import data.Apple;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static List<Apple> prepareInventoryReport(){
        List<Apple> apples = new ArrayList<>();

        Apple apple = new Apple(1,Color.RED,10);
        Apple apple1 = new Apple(2,Color.GREEN,11);
        Apple apple2 = new Apple(3,Color.BLUE,12);
        Apple apple3 = new Apple(4,Color.ORANGE,13);
        Apple apple4 = new Apple(5,Color.YELLOW,14);
        Apple apple5 = new Apple(6,Color.PINK,15);

        Apple appleGreen1 = new Apple(7,Color.GREEN,110);
        Apple appleGreen2 = new Apple(8,Color.GREEN,111);
        Apple appleGreen3 = new Apple(9,Color.GREEN,112);
        Apple appleGreen4 = new Apple(10,Color.GREEN,113);
        Apple appleGreen5 = new Apple(11,Color.GREEN,114);
        Apple appleGreen6 = new Apple(12,Color.GREEN,115);
        Apple appleGreen7 = new Apple(13,Color.GREEN,116);


        apples.add(apple);
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        apples.add(apple4);
        apples.add(apple5);

        apples.add(appleGreen1);
        apples.add(appleGreen2);
        apples.add(appleGreen3);
        apples.add(appleGreen4);
        apples.add(appleGreen5);
        apples.add(appleGreen6);
        apples.add(appleGreen7);


        return apples;
    }
}
