import com.osp.utils.Color;
import com.osp.utils.Constants;
import data.Apple;

import java.util.ArrayList;
import java.util.List;

public class FilteringWithEveryAttribute {
    public static void main(String args[]){
        FilteringWithEveryAttribute filterUseCaseUsingColorVariable = new FilteringWithEveryAttribute();
        List<Apple> inventory = Constants.prepareInventoryReport();
        List<Apple> greenApples = filterApples(inventory,Color.GREEN,0,true);
        for(Apple apple:greenApples){
            System.out.println("Green Apples "+apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }

        List<Apple> weightApples = filterApples(inventory,null,110,false);

        System.out.println("\n:::::::::::::::::::Weight Apples:::::::::::::::::::");
        for(Apple apple:weightApples){
            System.out.println("Weight Apples " +apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }
        List<Apple> redApples = filterApples(inventory,Color.RED,0,true);
        System.out.println("\n:::::::::::::::::::RED Apples:::::::::::::::::::");
        for(Apple apple:redApples){
            System.out.println("Red Apples "+apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }
    }

    public static List<Apple> filterApples(List<Apple> inventory,Color color,int weight,boolean flag){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if((flag && color.equals(apple.getColor()))||(!flag &&apple.getWeight()>weight)){
                result.add(apple);
            }
        }
        return result;
    }
}



