import java.util.*;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String description;
    private double rating;

    public Product(int id, String description, double rating) {
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
public class ProductRatingRandomizer {
    public static void main(String[] args) {
        // Create a list of 10 random products with randomized ratings
        List<Product> products = new ArrayList<>();
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int id = i;
            String description = "Product " + i;
            double rating = random.nextDouble()*4 +1; // Random rating between 1 and 5
            products.add(new Product(id, description, rating));
        }
        List<Product> collectTop3 = products.stream().sorted(Collections.reverseOrder(Comparator.comparing(Product::getRating)))
                .limit(3).collect(Collectors.toList());
        System.out.println(collectTop3);
        System.out.println("All sleetced nonselcted>>>>>>>>>>>>>>>>>>>>>");

        List<Product> collectRest = products.stream().sorted(Collections.reverseOrder(Comparator.comparing(Product::getRating)))
                .collect(Collectors.toList());
        System.out.println(collectRest);
    }
}