package show;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class movieTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		movie ms=new movie("kolkata",100,50,"03/April/0005 02:01 AM");
		ms.setMovieNameDetails();
//		String name=ms.getMovieNameDetails();
//		String genre=ms.getgenre();
		assertEquals("abcd",ms.getMovieNameDetails());
		assertEquals("thriller",ms.getgenre());
		
		System.out.println("This test ran");
	}

}
