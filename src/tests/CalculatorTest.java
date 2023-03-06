import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void TwoPlusTwoShouldEqualFour(){
        Calculator cal = new Calculator();
        assertEquals(4,cal.add(2,2));
    }

    @Test
    void TwoPlusThreeShouldEqualFive(){
         Calculator cal = new Calculator();
         assertEquals(5,cal.add(2,3));


    }
}
    

