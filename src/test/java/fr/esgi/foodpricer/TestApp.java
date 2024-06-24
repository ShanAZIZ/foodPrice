package fr.esgi.foodpricer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestApp {

    @Test
    void testComputeBasic() {
        App app = new App();
        int price = app.Compute("assiette", "b", "b", "moyen", "", "normal", "yes");
        Assertions.assertEquals(18, price);
    }

    @Test
    void testExtraCoffeeBug() {
        App app = new App();
        int price = app.Compute("assiette", "b", "b", "moyen", "", "normal", "no");
        Assertions.assertEquals(19, price);
    }
}
