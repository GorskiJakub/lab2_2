import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import pl.com.bottega.ecommerce.sharedkernel.Money;
 
 public class MoneyTest {
 
 	@Test
	public void test_ifBothAreEquals() {
		Money m1 = new Money(5.00, "USD");
		Money m2 = new Money(5.00, "USD");

		assertThat(m1, is(equalTo(m2)));
 	}
 
 }