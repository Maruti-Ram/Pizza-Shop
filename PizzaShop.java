/**
 * 
 */
package pizzaOrder;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Maruti on Apr 16, 2017 at 2:35:03 AM
 *
 */
public class PizzaShop {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = in.nextLine();
        ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
        String response = "y";
        while(response.equalsIgnoreCase("y"))
        {
        System.out.println("What type of pizza would you like? Regular or "
                + "Sicilian? ");
        String type = in.nextLine();
        if(type.equalsIgnoreCase("regular"))
        {
            System.out.println("What size(S, M, L, X)?");
            String size = in.nextLine();
            Regular pizza1 = new Regular();
            if(size.equalsIgnoreCase("S"))
            {
                pizza1 = new Regular(12);
            }
            else if(size.equalsIgnoreCase("M"))
            {
                pizza1 = new Regular(14);
            }
            else if(size.equalsIgnoreCase("L"))
            {
                pizza1 = new Regular(16);
            }
            else if(size.equalsIgnoreCase("X"))
            {
                pizza1 = new Regular(18);
            }
            else
            {
            	System.out.println("Wrong Choice. Please Select from S, M, or L");
            	continue;
            }
            pizza1.getToppings();
            pizzas.add(pizza1);
            
           
        }
      
        else if(type.equalsIgnoreCase("sicilian"))
        {
        	
            System.out.println("What size(S, M, L)?");
            String size = in.nextLine();
            Sicilian pizza1 = new Sicilian();
            if(size.equalsIgnoreCase("S"))
            {
                pizza1 = new Sicilian(10);
            }
            else if(size.equalsIgnoreCase("M"))
            {
                pizza1 = new Sicilian(12);
            }
            else if(size.equalsIgnoreCase("L"))
            {
                pizza1 = new Sicilian(14);
            }
        	
            else
            {
            	System.out.println("Wrong Choice. Please Select from S, M, or L");
            	continue;
            }
        	
			pizza1.getToppings();
            pizzas.add(pizza1);
            
        }
        
        else
        {
        	System.out.println("Wrong Choice. Please select from Regular or Sicilian");
        	continue;
        }
            System.out.println("Do you want to continue? (y/n)");
            response = in.nextLine();
        }
        
        for(Pizza p : pizzas)
        {
            p.printString();
        }
        

	}

}
