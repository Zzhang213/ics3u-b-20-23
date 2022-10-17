package assignment;

/**
 * BayviewGlenPools
 */
public class BayviewGlenPools {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);

        System.out.println("What is the length of the pool in foot?");
        double length = value.nextDouble();  

        System.out.println("What is the width of the pool in foot?");
        double width = value.nextDouble();  

        System.out.println("What is the depth of the deep end of the pool in foot?");
        double depthDeepEnd = value.nextDouble();  

        System.out.println("What is the depth of the shallow end of the pool in meter in foot? ");
        double depthShallowEnd = value.nextDouble();    

        System.out.println("What is the length of the shallow end of the pool in meter in foot?");
        double lengthShallowEnd = value.nextDouble();  

        System.out.println("What is the length of the transition of the pool in meter in foot?");
        double transition = value.nextDouble();   

        System.out.println("What is the price of the liner per meter square used for the pool?");
        double price = value.nextDouble();  

        double differenceDS = depthDeepEnd - depthShallowEnd; 
        double lengthTransition = Math.sqrt(Math.pow(transition, 2) - Math.pow(differenceDS, 2));
        double lengthDeepEnd = length - lengthShallowEnd - lengthTransition ;


        double waterNeeded = 
        (( lengthDeepEnd * width * depthDeepEnd) + 
        (lengthTransition * differenceDS/ 2 * width) + 
        (depthShallowEnd * (lengthShallowEnd +  lengthTransition) * width)
        ) * 0.9;

        double gallons = (waterNeeded * 7.481); 

        double areaLiner = 

        (depthDeepEnd * lengthDeepEnd * 2) + 
        (lengthTransition * differenceDS) +
        ((lengthTransition + lengthShallowEnd) * depthShallowEnd * 2) +

        (depthDeepEnd * width) +
        (depthShallowEnd * width) +
        (transition * width) +
        (lengthShallowEnd * width) +
        (lengthDeepEnd * width);

        double cost = (areaLiner/10.764 * price);

        System.out.println("The amount of water needed is " + gallons + " gallons");
        System.out.println("The amount of liner needed to creat the pool is " + areaLiner);
        System.out.println("The cost of the liner is " + cost); 

    }
    
}