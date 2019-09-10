import com.osp.utils.Color;
import com.osp.utils.Constants;
import data.Apple;

import java.util.ArrayList;
import java.util.List;

public class FilterUseCaseUsingColorVariable {
    public static void main(String args[]){
        FilterUseCaseUsingColorVariable filterUseCaseUsingColorVariable = new FilterUseCaseUsingColorVariable();
        List<Apple> inventory = Constants.prepareInventoryReport();
        List<Apple> greenApples = filterAppleByColor(inventory,Color.GREEN);
        for(Apple apple:greenApples){
            System.out.println("Green Apples "+apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }

        List<Apple> weightApples = filterApplesByWeight(greenApples,110);

        System.out.println("\n:::::::::::::::::::Weight Apples:::::::::::::::::::");
        for(Apple apple:inventory){
            System.out.println("Weight Apples " +apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }
        List<Apple> redApples = filterAppleByColor(inventory,Color.RED);
        System.out.println("\n:::::::::::::::::::RED Apples:::::::::::::::::::");
        for(Apple apple:redApples){
            System.out.println("Red Apples "+apple.getSequence()+"::"+apple.getColor()+"::"+apple.getWeight());
        }
    }

    public static List<Apple> filterAppleByColor(List<Apple> inventory,Color color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(color.equals(apple.getColor())){
                result.add(apple);
            }
        }
        return result;
    }
    public static List<Apple> filterApplesByWeight(List<Apple> inventory,int weight){
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if(apple.getWeight()>weight){
                result.add(apple);
            }        }
        return result;
    }


}



