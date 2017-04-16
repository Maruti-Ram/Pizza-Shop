/**
 * 
 */
package pizzaOrder;

import java.util.*;

/**
 * @author Maruti on Apr 16, 2017 at 2:36:48 AM
 *
 */
public class Regular extends Pizza {
	
	public Regular()
    {
        
    }
    public Regular(int size) {
        super(size);
        this.type = "Regular";
    }
    public double getCost()
    {
        return this.cost;
    }

    /**
     *  Updates the Toppings list
     */
    @Override
    public void getToppings()
    {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        System.out.println("How many toppings would you like?(Limited to 4 toppings only)");
        int numToppings = in.nextInt();
         while(numToppings > 4)
        {
            System.out.println("Sorry, you are limited to four toppings only. ");
            System.out.println("How many toppings would you like? ");
            numToppings = in.nextInt();
        }
         in.nextLine();
        for(int i = 0;i<numToppings;i++)
        {
            System.out.println("Enter topping no."+(i+1)+": ");
            String topping = in.nextLine();
            toppings.add(topping);
            this.cost += 2.00;
        }
    }


}
