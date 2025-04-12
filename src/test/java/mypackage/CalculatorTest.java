package mypackage;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void twoAndThreeIsFive() throws Exception {
        final long result = new Cal().addFucn(2, 3);
        assertThat(result, is(5L));
    }

    @Test
    public void threeMinusTwoIsOne() throws Exception {
        final long result = new Cal().subFucn(2, 3);
        assertThat(result, is(1L));
    }
    
    @Test
    public void threeXThreeIsNine() throws Exception {
        final long result = new Cal().mulFucn(3, 3);
        assertThat(result, is(9L));
    }
   
}
