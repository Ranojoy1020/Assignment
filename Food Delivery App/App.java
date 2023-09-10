import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        HashMap<String,Integer> Menu = new HashMap<>();
        
        Menu.put("PIZZA", 400);
        Menu.put("SANDWICH", 200);
        Menu.put("COFFEE", 50);
        Menu.put("BURGER", 100);
        
        System.out.println("Menu\n");
        System.out.println("Item" + "   " + "Price");
        
        for(Map.Entry<String, Integer> e : Menu.entrySet()){
            System.out.println(e.getKey() + "   " + e.getValue());
        }

        Scanner input = new Scanner(System.in);

        System.out.println("\nWhat do you want to order?");
        String item =  (input.nextLine()).toUpperCase();

        int cost = 0;

        if(Menu.containsKey(item)){
            cost = Menu.get(item);
        }
        
        System.out.println("\nEnter the quantity.");
        int quantity =  input.nextInt();
        
        System.out.println("\nHow far are you?");
        double dist =  input.nextDouble();

        Order o1 = new Order(item, cost, quantity, dist);
        System.out.println("You have ordered "+ o1.quantity+ " " + o1.food + "(s), and you are "+ o1.distance + " kms. away");

        
        System.out.println(o1.makeBill());

        

        input.close();


    } //! main() Closed

    
} //! Class Closed