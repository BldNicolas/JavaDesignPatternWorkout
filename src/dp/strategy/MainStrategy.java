package dp.strategy;

public class MainStrategy {
	public static void main(String[] args) {
		// Le code c'est ici !
		ShoppingCart cart = new ShoppingCart();
		cart.setPaymentMethod(new PayPalStrategy("Mon Email"));

		cart.checkout(100);
	}
}
