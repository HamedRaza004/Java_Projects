class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class ShoppingSystem {
    private int availableItems;

    public ShoppingSystem(int availableItems) {
        this.availableItems = availableItems;
    }

    public void purchase(int quantity) throws OutOfStockException {
        if (quantity > availableItems) {
            throw new OutOfStockException("Sorry, the requested quantity is not available.");
        }
        availableItems -= quantity;
        System.out.println(quantity + " items purchased successfully.");
        System.out.println("Remaining items: " + availableItems);
    }
}

public class Q4 {
    public static void main(String[] args) {
        ShoppingSystem shop = new ShoppingSystem(10);
        try {
            shop.purchase(5);
            shop.purchase(8);
        } catch (OutOfStockException e) {
            System.err.println(e.getMessage());
        }
    }
}
