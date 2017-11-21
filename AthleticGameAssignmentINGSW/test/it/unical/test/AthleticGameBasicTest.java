package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {
	

//	aggiungere un test per testare il metodo addArrival(String participant, Instant arrival).
//	In questo test verificare che, aggiungendo un nuovo arrivo,
//	la taglia della mappa arrivals diventi pari ad 1
		
	@Test
	public void testAddArrival() {
		AthleticGame tmp = new AthleticGame("sportTMP");
		tmp.addArrival("participant", Instant.EPOCH);
		Assert.assertEquals(1,tmp.getArrivals().size());
	}


//	aggiungere un test per verificare che getParecipiantTime(String participant)
//	lanci un'eccezione in caso di partecipante non valido

	@Test(expected=IllegalArgumentException.class)
	public void testGetPartecipiantTime() {
		AthleticGame tmp = new AthleticGame("sportTMP");
		tmp.getParecipiantTime("nullo");
	}
	
	
}
