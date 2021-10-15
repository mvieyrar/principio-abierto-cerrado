package solid.openClosed.proposal;

public class AirShipping implements Shipping {

	@Override
	public double getCost(Order order) {
		return Double.max(20, order.getTotalWeight() * 3);
	}

}
