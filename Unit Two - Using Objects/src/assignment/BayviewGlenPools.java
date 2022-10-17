package assignment;

import java.util.Scanner;


public class BayviewGlenPools {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        System.out.println("What is the length of the pool?");
        double length = value.nextDouble();  

        System.out.println("What is the width of the pool?");
        double width = value.nextDouble();  

        System.out.println("What is the depth of the deep end of the pool?");
        double depthDeepEnd = value.nextDouble();  

        System.out.println("What is the depth of the shallow end of the pool? ");
        double depthShallowEnd = value.nextDouble();    

        System.out.println("What is the length of the shallow end of the pool?");
        double lengthShallowEnd = value.nextDouble();  

        System.out.println("What is the length of the transition of the pool?");
        double transition = value.nextDouble();   

        System.out.println("What is the price of the liner per meter square used for the pool?");
        double price = value.nextDouble();  

        double differenceDS = depthDeepEnd - depthShallowEnd; 
        double lengthTransition = Math.sqrt(Math.pow(transition, 2) - Math.pow(differenceDS, 2));
        double lengthDeepEnd = length - lengthShallowEnd - lengthTransition ;


        double waterNeeded = 
        Math.round(((( lengthDeepEnd * width * depthDeepEnd) + 
        (lengthTransition * differenceDS/ 2 * width) + 
        (depthShallowEnd * (lengthShallowEnd +  lengthTransition) * width)
        ) * 0.9) * 100) /100.0;

        double areaLiner = 
        Math.round(((depthDeepEnd * lengthDeepEnd * 2) + 
        (lengthTransition * differenceDS) +
        ((lengthTransition + lengthShallowEnd) * depthShallowEnd * 2) +

        (depthDeepEnd * width) +
        (depthShallowEnd * width) +
        (transition * width) +
        (lengthShallowEnd * width) +
        (lengthDeepEnd * width)) * 100) /100.0 ;

        double cost = Math.round(areaLiner * price * 100) /100.0;

        System.out.println("The amount of water needed is " + waterNeeded); 
        System.out.println("The amount of liner needed is " + areaLiner);
        System.out.println("The cost of the liner is " +  "$" + cost); 

    }
    
}