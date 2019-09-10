package com.osp.predicate;

import com.osp.service.ApplePredicate;
import com.osp.service.impl.AppleGreenColorPredicate;
import com.osp.service.impl.AppleHeavyWeightPredicate;
import com.osp.utils.Constants;
import data.Apple;

import java.util.ArrayList;
import java.util.List;

public class BehaviorParameterization {
    public static void main(String args[]){
        List<Apple> greenApples =filterApple(Constants.prepareInventoryReport(),new AppleGreenColorPredicate());
        for(Apple apple:greenApples){
            System.out.println("Green Apples " +apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }
        System.out.println(":::::::Weight Apples:::::::::");
        List<Apple> weightApples = filterApple(Constants.prepareInventoryReport(),new AppleHeavyWeightPredicate());
        for(Apple apple:weightApples){
            System.out.println("Weight Apples " +apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }
        System.out.println(":::::::Green Weight Apples:::::::::");
        List<Apple> greenWeightApples = filterApple(Constants.prepareInventoryReport(),new AppleHeavyWeightPredicate());
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
}
