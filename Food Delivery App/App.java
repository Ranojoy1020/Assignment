/**
 * app
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String menu[] = {"Pizza","Sandwich","Coffee","Burger"};
        int cost[] = {400,200,50,100};

        System.out.println("Menu\n");
        System.out.println("Item" + "   " + "Price");

        for(int i = 0; i < menu.length; i++){
            System.out.println(menu[i] + "   " + cost[i]);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("\nWhat do you want to order?");
        String item =  input.nextLine();
        
        System.out.println("\nHow far are you?");
        double dist =  input.nextDouble();

        Order o1 = new Order(item, dist);
        System.out.println("You have ordered "+ o1.food + ", and you are "+ o1.distance + "kms. away");


        input.close();


    } //! main() Closed

    
} //! Class Closed