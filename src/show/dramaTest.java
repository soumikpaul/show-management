package show;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class dramaTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		drama dr=new drama("kolkata",100,50,"03/April/0005 02:01 AM");
		dr.setDramaNameDetails();
		//String dramaName=dr.getDramaNameDetails();
		assertEquals("desh",dr.getDramaNameDetails());
		System.out.println("This test ran");
	}

}
