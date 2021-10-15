package solid.openClosed.proposal;

public class GroundShipping implements Shipping {

	@Override
	public double getCost(Order order) {
		if (order.getTotal() > 100) {
            return 0;
        }

        return Double.max(10, order.getTotalWeight() * 1.5);
	}

}
