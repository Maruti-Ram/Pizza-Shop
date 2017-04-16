/**
 * 
 */
package pizzaOrder;
import java.util.*;

/**
 * @author Maruti on Apr 16, 2017 at 2:33:17 AM
 *
 */
@SuppressWarnings("rawtypes")
public abstract class Pizza implements Comparable {
	
	public static final int sm = 12; 
    public static final int md = 14; 
    public static final int lg = 16; 
    public static final int xl = 18; 
    public double[] price = {10.00, 12.00, 14.00, 16.00};
    public double cost;
    public String type;
    public ArrayList<String> toppings = new ArrayList<String>();
    int size;
    public Pizza()
    {
        type = "pizza";
    }
    public Pizza(int size)
    {
        switch(size)
        {
            case sm:
                cost = price[0];size = sm; break;
            case md:
                cost = price[1];size = md;break;
            case lg:
                cost = price[2];size = lg;break;
            case xl:
                cost = price[3];size = xl;break;
            default:
                System.out.println("Invalid size");
                break;                
        }
    }
  
    public abstract void getToppings();
 @Override
    public int compareTo(Object t) {
        Pizza other = (Pizza)t;
        if(this.size < other.size)
            return -1;
        else if (this.size == other.size)
            return 0;
        else 
            return 1;
    }
     public void printString()
    {
        String topping="";
        if(toppings.size()==0)
            topping = "No toppings selected.";
        else
        {
            for(int i = 0; i<toppings.size();i++)
            {
                topping += toppings.get(i) + " ";
            }
        }
        System.out.println("Your Order has been Successfully Placed");
        System.out.println("Toppings Selected:" + topping +
                " \nTotal cost: $"+cost);
    }

}
