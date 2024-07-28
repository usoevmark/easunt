/**
 * Represents a collection of items.
 * Each item is an object stored in an array.
 */
public class JavaMini06 {

    /**
     * An array of Object representing the items.
     */
    private Object[] items;

    /**
     * Constructor to initialize the items array.
     * 
     * @param items The array of objects to be set as items.
     */
    public JavaMini06(Object[] items) {
        this.items = items;
    }

    /**
     * Gets the items array.
     * 
     * @return The array of objects representing the items.
     */
    public Object[] getItems() {
        return items;
    }

    /**
     * Sets the items array.
     * 
     * @param items The array of objects to be set as items.
     */
    public void setItems(Object[] items) {
        this.items = items;
    }

    /**
     * Displays information about the items.
     */
    public void displayItems() {
        System.out.println("Items: ");
        for (Object item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Example usage
        Object[] exampleItems = { "Item1", 2, 3.0 };
        JavaMini06 javaMini06 = new JavaMini06(exampleItems);
        javaMini06.displayItems();
    }
}
