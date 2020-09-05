package show;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class displayTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		display d=new display();
		d.cityName();
		d.dispShow();
		d.totalShow();
		d.bookShow();
		System.out.println("This test case worked");
	}

}
