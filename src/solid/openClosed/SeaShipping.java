package solid.openClosed.proposal;

public class SeaShipping implements Shipping {

	@Override
	public double getCost(Order order) {
		return Double.max(15, order.getTotalWeight() * 2);
	}

}
