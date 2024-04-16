import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BooleanSupplier;

public class CurrencyConverter {

    static final int DECIMAL_DIGITS = 2;


	public static void main(String[] args) {
        System.out.println("Hello Currency Converter 002");
        System.out.println("Add line from dev");
    }

    
	public BigDecimal convert(BigDecimal originalAmount, BigDecimal conversionRate) {
		BigDecimal convertedAmount = originalAmount.multiply(conversionRate);
		return convertedAmount.setScale(DECIMAL_DIGITS, RoundingMode.HALF_UP);
	}


	public boolean isValidRate(BigDecimal conversionRate) {
	    BigDecimal lowerBound = BigDecimal.valueOf(0.05); // Lower bound
	    BigDecimal upperBound = BigDecimal.valueOf(0.06); // Upper bound
	    // Check conversion rate within the range
	    return conversionRate.compareTo(lowerBound) >= 0 && conversionRate.compareTo(upperBound) <= 0;
	}

}
