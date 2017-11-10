package art.b;

public class ProductFixtures {
    public static Product door = new Product("Wodden Door", 35);
    public static Product window = new Product("Glass Window", 10);
    public static Product floorPanel = new Product("Floor Panel", 25);

    public static Supplier bobs = new Supplier("Bob's household Supplies");
    public static Supplier kates = new Supplier("Kate's Home Goods");

    static {
        bobs.products().add(door);
        bobs.products().add(floorPanel);
        bobs.products().add(window);

        kates.products().add(new Product("Wodden Door", 35));
        kates.products().add(floorPanel);
    }
}
