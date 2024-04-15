import java.math.BigDecimal;

public class CurrencyConverter {

    static final int DECIMAL_DIGITS = 2;


	public static void main(String[] args) {
        System.out.println("Hello Currency Converter 002");
        System.out.println("Add line from dev");
    }

    
	public BigDecimal convert(BigDecimal originalAmount, BigDecimal conversionRate) {
		BigDecimal convertedAmount = originalAmount.multiply(conversionRate);
		return convertedAmount.setScale(DECIMAL_DIGITS);
	}

}
