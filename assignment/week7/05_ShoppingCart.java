public class ShoppingCart {
    private double[] prices;
    private int itemCount;
    public final String cartId;

    public ShoppingCart(String cartId, int maximumItems) {
        this.cartId = cartId;
        prices = new double[maximumItems];
        itemCount = 0;
    }

    public void addItem(double price) {
        if (price > 0 && itemCount < prices.length) {
            prices[itemCount] = price;
            itemCount++;
        }
    }

    public double getTotal() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }

        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart("CART-5", 20);

        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);

        System.out.println("Total: " + cart.getTotal());
        System.out.println("Item count: " + cart.getItemCount());
    }
}