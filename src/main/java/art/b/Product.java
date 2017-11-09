package art.b;

import java.util.Comparator;

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
    //(p1, p2) -> Integer.compare(p1.getWeight(), p2.getWeight())

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


}
