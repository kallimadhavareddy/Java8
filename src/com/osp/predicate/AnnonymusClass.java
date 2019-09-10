package com.osp.predicate;

import com.osp.service.ApplePredicate;
import com.osp.service.impl.AppleGreenColorPredicate;
import com.osp.service.impl.AppleHeavyWeightPredicate;
import com.osp.utils.Color;
import com.osp.utils.Constants;
import data.Apple;

import java.util.ArrayList;
import java.util.List;

import static com.osp.utils.Color.GREEN;

public class AnnonymusClass {
    public static void main(String args[]){

        printClass(new Apple(100, Color.RED,150));

        List<Apple> greenApples =filterApple(Constants.prepareInventoryReport(), new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                 return GREEN.equals(apple.getColor());
            }
        });
        for(Apple apple:greenApples){
            System.out.println("Green Apples " +apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }
        System.out.println(":::::::Weight Apples:::::::::");
        List<Apple> weightApples = filterApple(Constants.prepareInventoryReport(),new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight()>10;
            }
        });
        for(Apple apple:weightApples){
            System.out.println("Weight Apples " +apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }
        System.out.println(":::::::Green Weight Apples:::::::::");
        List<Apple> greenWeightApples = filterApple(Constants.prepareInventoryReport(),new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return GREEN.equals(apple.getColor()) && apple.getWeight()>111;
            }
        });
        for(Apple apple:greenWeightApples){
            System.out.println("Green Weight Apples " +apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }
    }
    public static List<Apple> filterApple(List<Apple> inventory, ApplePredicate predicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple:inventory){
            if(predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }


    public static void printClass(Apple apple){

        System.out.println(apple.getSequence());

    }
}
