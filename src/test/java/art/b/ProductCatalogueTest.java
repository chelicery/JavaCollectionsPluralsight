package art.b;

import org.junit.Test;

import static art.b.ProductFixtures.*;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;


public class ProductCatalogueTest {
    @Test
    public void shouldOnlyHoldUniqueProducts() throws Exception
    {
        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue, containsInAnyOrder(door, floorPanel, window));
    }
    @Test
    public void shouldFindLightVanProducts() throws Exception{
        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.lightVanProducts(), containsInAnyOrder(window));
    }

    @Test
    public void shouldFinHeavyVanProducts() throws Exception{
        ProductCatalogue catalogue = new ProductCatalogue();

        catalogue.isSuppliedBy(bobs);
        catalogue.isSuppliedBy(kates);

        assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(door, floorPanel));
    }
}