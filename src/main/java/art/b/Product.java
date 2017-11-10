package art.b;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Comparator.comparing;

public class Product {

    /*        Comparator<Product> BY_WEIGHT
                    = new Comparator<Product>()
            {
                public int compare(final Product p1, final Product p2)
                {
                    return Integer.compare(p1.getWeight(), p2.getWeight());
                }
     THE SAME WITH LAMBDA:
    */
    public static final Comparator<Product> BY_WEIGHT
            = comparing(Product::getWeight);
    //(p1, p2) -> Integer.compare(p1.getWeight(), p2.getWeight())\
    public static final Comparator<Product> BY_NAME
            = comparing(Product::getName);

    private String name;
    private int weight;

    public Product(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return " Name= " + this.name + ", " + " weight= " + this.weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (weight != product.weight) return false;

        return Objects.equals(this.name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}
