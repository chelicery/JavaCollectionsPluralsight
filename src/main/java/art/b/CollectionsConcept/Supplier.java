package art.b.CollectionsConcept;

import art.b.CollectionsConcept.Product;

import java.util.ArrayList;
import java.util.List;

public class Supplier {

    private String description;
    private final List<Product> products = new ArrayList<>();


    public Supplier(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public List<Product> products(){
        return products;
    }
    @Override
    public String toString(){
        return "Description: " + this.description + " Products: " + this.products;
    }


}
