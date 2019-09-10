import com.osp.utils.Color;
import com.osp.utils.Constants;
import data.Apple;

import java.util.ArrayList;
import java.util.List;

public class FilterUseCaseJava7Example {
    public static void main(String args[]){
        FilterUseCaseJava7Example predicateExample = new FilterUseCaseJava7Example();
        List<Apple> inventory = Constants.prepareInventoryReport();
        List<Apple> greenApples = filterGreenApple(inventory);
        for(Apple apple:greenApples){
            System.out.println("Green Apples "+apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }

        List<Apple> weightApples = filterApplesByWeight(greenApples);
        for(Apple apple:weightApples){
            System.out.println("\nWeight Apples " +apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }

        List<Apple> redApples = filterRedApples(inventory);
        for(Apple apple:redApples){
            System.out.println("Red Apples "+apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }
    }

    public static List<Apple> filterGreenApple(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(Color.GREEN.equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterRedApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(Color.RED.equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> filterApplesByWeight(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(apple.getWeight()>115){
                result.add(apple);
            }        }
        return result;
    }

}



