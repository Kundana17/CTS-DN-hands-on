import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Product products[] = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Bottle", "Home"),
                new Product(104, "Notebook", "Stationery")
        };

        // Linear Search
        Product p1 = SearchUtil.linearSearch(products, "Mouse");
        System.out.println("Linear Search");
        if (p1 != null) {
            System.out.println("Found : " + p1.name);
        }

        // Binary Search
        Arrays.sort(products, Comparator.comparing(p -> p.name));
        Product p2 = SearchUtil.binarySearch(products, "Mouse");
        System.out.println("\nBinary Search");
        if (p2 != null) {
            System.out.println("Found : " + p2.name);
        }
    }
}