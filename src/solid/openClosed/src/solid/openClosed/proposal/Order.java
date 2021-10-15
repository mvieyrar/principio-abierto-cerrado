package solid.openClosed.proposal;

import java.util.ArrayList;

public class Order
{
    private ArrayList<Item> items = new ArrayList<>();
    private String country;    
    private Shipping shipping;
    private TaxCalculator taxCalculator;

    public Order(String country, Shipping shipping) {
		this.country = country;
		this.shipping = shipping;
		this.taxCalculator = new TaxCalculator();
	}

	public double getTotal() {
        double total = 0;

        for (Item item: items) {
            total += item.getPrice() * item.getQuantity();
        }
        
        total += taxCalculator.getTaxRate(country);

        return total;
    }

    public double getTotalWeight() {
        double weight = 0;

        for (Item item: items) {
            weight += item.getWeight();
        }

        return weight;
    }
    
    public double getShippingCost() {
    	return shipping.getCost(this);	
    }    

    public void addItem(Item item) {
        items.add(item);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

	public Shipping getShipping() {
		return shipping;
	}

	public void setShipping(Shipping shipping) {
		this.shipping = shipping;
	}
    
}
