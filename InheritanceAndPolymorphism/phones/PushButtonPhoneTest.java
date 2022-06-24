package phones;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * Tests the public methods from class PushButtonPhone.
 * 
 * = = = This test class should not be modified. = = =
 */
class PushButtonPhoneTest {
	
@Test
void pushButtonPhone_initializesFields() {
PushButtonPhone pushButtonPhone1 = new PushButtonPhone();
assertEquals("Avaya 9611G IP (249.9 x 199.9 x 70.1) V110 not  connected", pushButtonPhone1.toString());
}

@Test
void call_returnsMessageIncludingTheNumberProvided() {
PushButtonPhone pushButtonPhone2 = new PushButtonPhone(); 
assertTrue(pushButtonPhone2.call("8015817200").matches("Pushing buttons to call 8015817200")); 
}
}