package show;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class musicTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		music ms=new music("kolkata",100,50,"03/April/0005 02:01 AM");
		ms.setMusicNameDetails();
		//String artist=ms.getArtistDetails();
		assertEquals("coldplay",ms.getArtistDetails());
		System.out.println("This test ran");

	}

}
