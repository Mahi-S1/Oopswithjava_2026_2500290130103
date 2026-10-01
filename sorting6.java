import java.util.*;

class Product implements Comparable<Product> {
    int id;
    String name;
    int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name + " " + this.price;
    }

    @Override
    public int compareTo(Product p) {
        return this.price - p.price;
    }
}

public class sorting6 {
    public static void main(String[] args) {

        List<Product> l = new ArrayList<>();

        l.add(new Product(1, "A", 500));
        l.add(new Product(2, "B", 220));
        l.add(new Product(3, "C", 1000));
        l.add(new Product(4, "D", 800));

        l.sort(null);

        System.out.println(l);
    }
}