package art.b.HelpdeskQueues;

public class Enquiry {
    private final Customer customer;
    private final Category category;

    public Enquiry(Customer customer, Category category){
        this.category = category;
        this.customer = customer;
    }

    @Override
    public String toString(){
        return "Customer: " + this.customer + " Category: "+ this.category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Category getCategory() {
        return category;
    }
}
