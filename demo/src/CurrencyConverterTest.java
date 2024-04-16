import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CurrencyConverterTest {
	
	private CurrencyConverter converter;

	@BeforeEach
	void setUp() throws Exception {
		this.converter = new CurrencyConverter();
	}
	
	@Test
	void testConvert() {
		BigDecimal originalAmount = BigDecimal.valueOf(100.00);
		BigDecimal conversionRate = BigDecimal.valueOf(2.70);
		BigDecimal expectedResult = BigDecimal.valueOf(270.00).setScale(CurrencyConverter.DECIMAL_DIGITS);
		BigDecimal actualResult = converter.convert(originalAmount, conversionRate);
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void testConvertRounding() {
		BigDecimal originalAmount = BigDecimal.valueOf(99.99);
		BigDecimal conversionRate = BigDecimal.valueOf(0.055);
		BigDecimal expectedResult = BigDecimal.valueOf(5.50).setScale(CurrencyConverter.DECIMAL_DIGITS);
		BigDecimal actualResult = converter.convert(originalAmount, conversionRate);
		assertEquals(expectedResult, actualResult);
		
	}
	
	@Test
	void isTestValidWhenRateWithinRange() {
		BigDecimal conversionRate = BigDecimal.valueOf(0.055);
		assertTrue(converter.isValidRate(conversionRate));
	}

}
