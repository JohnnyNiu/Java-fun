package number;

import java.util.Scanner;

/**
 * Created by xiaomingniu on 5/06/15.
 */
public class TileCostCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter width: ");
        int width = sc.nextInt();

        System.out.println("Please enter hight: ");
        int height = sc.nextInt();


        System.out.println("Please enter cost of each tile: ");
        double cost = sc.nextDouble();

        double totalCost = width*height*cost;
        System.out.println(String.format("Your total cost is %f", totalCost));
    }
}
