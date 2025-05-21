import static org.junit.jupiter.api.Assertions.*;

import com.demo.lektion1.DiscountService;
import org.junit.jupiter.api.Test;

public class DiscountServiceTest {

    @Test
    void applyDiscountWhenSumExceeds500WithTenPercent(){
        DiscountService discountService = new DiscountService();
        double sum = 500;
        double discount = 10;
        discountService.discount = discount;
        discountService.sum = sum;
        System.out.println(discountService.applyDiscount());

        //applyDiscount();
        assertEquals(450, discountService.applyDiscount());

    }

}
