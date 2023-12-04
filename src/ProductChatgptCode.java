
import java.util.*;
import java.util.stream.Collectors;

class Product1 {
    private int id;
    private String description;
    private double rating;

    public Product1(int id, String description, double rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", description=" + description + ", rating=" + rating + "]";
    }
}

public class ProductChatgptCode {
    public static void main(String[] args) {
        // Create a list of 10 random products with randomized ratings
        List<Product1> products = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int id = i;
            String description = "Product " + i;
            double rating = random.nextDouble() * 4 + 1; // Random rating between 1 and 5
            products.add(new Product1(id, description, rating));
        }

        // Sort the products by average rating in descending order
        Collections.sort(products, (p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));

        // Select the top 3 products with the highest average ratings
        List<Product1> top3Products = products.subList(0, Math.min(3, products.size()));

        // Print the top 3 products
        System.out.println("Top 3 Products with Maximum Average Ratings:");
        for (Product1 product : top3Products) {
            System.out.println(product);
        }

        System.out.println("allProducts:");
        List<Product1> collect = products.stream().sorted(Collections.reverseOrder
                (Comparator.comparing(Product1::getRating))).collect(Collectors.toList());
        System.out.println(collect);

    }
}
