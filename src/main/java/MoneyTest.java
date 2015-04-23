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
 
 		@Test
 		public void test_ifBothAreNotEquals() {
 			Money m1 = new Money(5.00, "USD");
 			Money m2 = new Money(3.00, "USD");
 	
 			assertThat(m1, is(not(equalTo(m2))));
 		}
 		
 			@Test
 			public void test_addMoneyIfTrue() {
 				Money m1 = new Money(5.00, "USD");
 				Money m2 = new Money(3.00, "USD");
 				Money expected = new Money(8, "USD");
 		
 				assertThat(m1.add(m2), is(equalTo(expected)));
 			}
 				@Test (expected = IllegalArgumentException.class)
 				public void test_addDifferentCurrencies_shouldBeException() {
 					Money m1 = new Money(5.00, "USD");
 					Money m2 = new Money(3.00, "PLN");
 					m1.add(m2);		
 				}
 				
 					@Test
 					public void test_multiplyByIfTrue() {
 						Money m = new Money(5.00, "USD");
 						double number = 3.00;
 						double expected = 15.00;
 						
 						assertThat(m.multiplyBy(number), is(new Money(expected, "USD")));	
 					}
 					
 					@Test
 					public void test_multiplyByIfDifferentCurrency_shouldBeFalse() {
 						Money m = new Money(5.00, "USD");
 						double number = 3.00;
 						double expected = 15.00;
 						
 						assertThat(m.multiplyBy(number), is(not (new Money(expected, "EUR"))));		
 					}
 }