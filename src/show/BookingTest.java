package show;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookingTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		Booking book=new Booking("movie","kolkata",200,100);
		assertEquals(100,book.getAvail());
	}

}
