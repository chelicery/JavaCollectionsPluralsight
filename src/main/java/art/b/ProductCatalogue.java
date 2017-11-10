package art.b;

import java.util.*;

import static art.b.Product.BY_WEIGHT;


public class ProductCatalogue implements Iterable<Product>{
    private final SortedSet<Product> products = new TreeSet<>(BY_WEIGHT);

    public void isSuppliedBy(Supplier supplier){
        products.addAll(supplier.products());
    }
    public Set<Product> heavyVanProducts(){
        Product heaviestLightVanProduct = findHeaviestProduct();
        return this.products.tailSet(heaviestLightVanProduct);

    }
    public Set<Product> lightVanProducts(){
        Product heaviestLightVanProduct = findHeaviestProduct();
        return products.headSet(heaviestLightVanProduct);

    }
    private Product findHeaviestProduct(){
        for(Product p : products){
            if(p.getWeight() > 20){
                return p;
            }
        }
        return products.last();
    }

    public Iterator<Product> iterator() {return products.iterator();}
}