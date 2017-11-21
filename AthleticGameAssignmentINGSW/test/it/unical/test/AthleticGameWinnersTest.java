package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	
// utilizzare @BeforeClass per istanziare un campo privato
// statico di tipo AthleticGame su cui effettuare i test

	private static AthleticGame athleticGame;
	
@BeforeClass
public static void init() {
	athleticGame = new AthleticGame("sportTest");
}


//utilizzare @After per richiamare il metodo reset()
@After
public void richiamaReset() {
	athleticGame.reset();
}


//utilizzare @Before per richiamare il metodo start()
@Before
public void richiamaStart() {
	athleticGame.start();
}


//aggiungere due metodi di test per la funzione getWinner
//(scegliere i test in modo significativo, ma a piacere)
@Test
public void testNullo() {
	AthleticGame tmp = new AthleticGame("");
	Assert.assertNull(tmp.getWinner());
}

@Test
public void testPrimo() throws InterruptedException {
	athleticGame.addArrival("3", Instant.now());
	Thread.sleep(100);
	athleticGame.addArrival("2", Instant.now());
	Thread.sleep(100);
	athleticGame.addArrival("1", Instant.now());

	Assert.assertEquals("3", athleticGame.getWinner());
}




}
