import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CurrencyConverterTest {

	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	void testConvert() {
		
		CurrencyConverter converter = new CurrencyConverter();
		BigDecimal originalAmount = BigDecimal.valueOf(100.00);
		BigDecimal conversionRate = BigDecimal.valueOf(2.70);
		BigDecimal expectedResult = BigDecimal.valueOf(270.00).setScale(CurrencyConverter.DECIMAL_DIGITS);
		BigDecimal actualResult = converter.convert(originalAmount, conversionRate);
		assertEquals(expectedResult, actualResult);
		
	}
	
	void test() {
		fail("Not yet implemented");
	}

}
