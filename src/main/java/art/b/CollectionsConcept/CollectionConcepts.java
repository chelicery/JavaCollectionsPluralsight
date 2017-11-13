package art.b.CollectionsConcept;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionConcepts {
    public static void main(String... args){
        Product door = new Product("Wooden door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass window", 10);

        Collection<Product> products = new ArrayList<Product>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);


     final Iterator<Product> productIterator = products.iterator();

        while(productIterator.hasNext()){
            Product product = productIterator.next();
            if(product.getWeight() > 20){
                System.out.println(product);
            } else {
                productIterator.remove();
            }

        }
        System.out.println(products.size());
        System.out.println(products.isEmpty());
        System.out.println(products.contains(window));
        System.out.println(products.contains(door));

        Collection<Product> otherProducts = new ArrayList<Product>();
        otherProducts.add(door);
        otherProducts.add(window);
        products.removeAll(otherProducts);

        System.out.println(products);

   for(Product p : products){

       System.out.println(p);
   }





    }

}
