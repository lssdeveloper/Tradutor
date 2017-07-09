import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteTradutor {
	
	private Tradutor t; 
	
	@Before //esta annotation roda antes de cada teste
	public void iniciarTradutor(){
		t = new Tradutor();
	}	
	
	@Test
	public void tradutorSemPalavras(){
		assertTrue(t.estaVazio());
	}
	
	@Test
	public void umaTraducao(){
		t.adicionaTraducao("bom", "good");
		assertFalse(t.estaVazio());
		assertEquals("good", t.traduzir("bom"));
	}
	
	@Test
	public void duasTraducoes(){
		t.adicionaTraducao("bom", "good");		
		t.adicionaTraducao("mau", "bad");
		assertEquals("good", t.traduzir("bom"));		
		assertEquals("bad", t.traduzir("mau"));
	}	
	@Test
	public void duasTraducoesMesmaPalavra(){
		t.adicionaTraducao("bom", "good");		
		t.adicionaTraducao("bom", "nice");
		assertEquals("good, nice", t.traduzir("bom"));		
	}
	@Test
	public void traduzirFrase(){
		t.adicionaTraducao("é", "is");		
		t.adicionaTraducao("bom", "good");
		t.adicionaTraducao("morar", "living");
		t.adicionaTraducao("na", "in the");
		t.adicionaTraducao("serra", "mountains");		
		assertEquals("is good living in the mountains", t.traduzirFrase("é bom morar na serra"));		
	}
	@Test
	public void traduzirFraseComDuasTraducoesMesmaPalavra(){
		t.adicionaTraducao("é", "is");		
		t.adicionaTraducao("bom", "good");
		t.adicionaTraducao("bom", "nice");		
		t.adicionaTraducao("morar", "living");
		t.adicionaTraducao("na", "in the");
		t.adicionaTraducao("serra", "mountains");		
		assertEquals("is good living in the mountains", t.traduzirFrase("é bom morar na serra"));		
	}	
}
