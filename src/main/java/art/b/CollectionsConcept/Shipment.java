package art.b.CollectionsConcept;

import art.b.CollectionsConcept.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shipment implements Iterable<Product>{

    private static final int LIGHT_VAN__MAX_WEIGHT = 20;
    private static final int PRODUCT_NOT_PRESENT = -1;
    private List<Product> lightVanProducts;
    private List<Product> heavyVanProducts;

    private final List<Product> products = new ArrayList<Product>();

    public void add(Product product){
        products.add(product);
    }

    public void replace(Product oldProduct, Product newProduct){
            final int index = products.indexOf(oldProduct);
            if(index!= PRODUCT_NOT_PRESENT){
                products.set(index, newProduct);
            }
    }

    public void prepare(){
        products.sort(Product.BY_WEIGHT);

        //find the product index that needs the heavy van

        int splitPoint = findSplitPoint();

        lightVanProducts = products.subList(0, splitPoint);
        heavyVanProducts = products.subList(splitPoint, products.size());

        }


    private int findSplitPoint(){
        for(int i = 0; i < products.size(); i++){
            final Product  product = products.get(i);

            if(product.getWeight() > LIGHT_VAN__MAX_WEIGHT){
                return i;
            }
        }
    return 0;
    }
    public List<Product> getHeavyVanProducts(){
        return heavyVanProducts;
    }

    public List<Product> getLightVanProducts(){
        return lightVanProducts;
    }

    public Iterator<Product> iterator() { return products.iterator();}

}
