
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class TestTriangle{

	static Triangle t1 = null;
	static Triangle t2 = null;
	static Triangle equilatero = null;
	static Triangle isoceles = null;;
	static Triangle isocelesBC = null;;
	static Triangle escaleno = null;;
	static Triangle ladoNegativo = null;;
	static Triangle ladoNegativoB = null;;
	static Triangle ladoNegativoC = null;;
	static Triangle ladoInexistente = null;;
	static Triangle ladoInexistenteBC = null;;
	static Triangle ladoInexistenteAC = null;;
	
	@BeforeClass
	public static void iniciaCasosDeTeste(){
		
		t1 = new Triangle(4, 2, 4);
		t2 = new Triangle(4, 2, 4);
		equilatero = new Triangle(3, 3, 3);
		isoceles = new Triangle(2, 2, 3);
		isocelesBC = new Triangle(2, 3, 3);
		escaleno = new Triangle(3, 4, 5);
		ladoNegativo = new Triangle(-1, 2, 2);
		ladoNegativoB = new Triangle(1, -2, 2);
		ladoNegativoC = new Triangle(1, 2, -2);
		ladoInexistente = new Triangle(1, 1, 2);
		ladoInexistenteBC = new Triangle(2, 1, 1);
		
	}
	
	//@SuppressWarnings("static-access")
	@Test
	public void testCreateTriangle( ) {
		
		Triangle t1 = new Triangle(4, 2, 4);
		
		//Verificando se o construtor est� correto
		assertEquals("Primeiro lado", t1.a, 4);
		assertEquals("Segundo lado ", t1.b, 2);
		assertEquals("Terceiro lado", t1.c, 4);
		assertNotNull(t1.a);
		assertNotNull(t1.b);
		assertNotNull(t1.c);
	}
	
	@Test
	public void testTypeTriangle( ) {
		
		//1-EQUILATERO 2-ISOSCELES 3-ESCALENO 4-INEXISTENTE
		assertTrue("� um tri�ngulo equil�tero", equilatero.determineType() == 1);
		assertTrue("� um tri�ngulo isoceles", isoceles.determineType() == 2);
		assertTrue("� um tri�ngulo isoceles", isocelesBC.determineType() == 2);
		assertTrue("� um tri�ngulo escaleno", escaleno.determineType() == 3);
		assertTrue("� um tri�ngulo com lado negativo", ladoNegativo.determineType() == 4);
		assertTrue("� um tri�ngulo com lado negativo", ladoNegativoB.determineType() == 4);
		assertTrue("� um tri�ngulo com lado negativo", ladoNegativoC.determineType() == 4);
		assertTrue("� um tri�ngulo com lado positivo mas inexistente", ladoInexistente.determineType() == 4);
		assertTrue("� um tri�ngulo com lado positivo mas inexistente", ladoInexistenteAC.determineType() == 4);
		assertTrue("� um tri�ngulo com lado positivo mas inexistente", ladoInexistenteBC.determineType() == 4);
		assertTrue("� um tri�ngulo", t1.determineType() != 4);
		assertTrue("� um tri�ngulo is�sceles", t1.determineType() == 2);
		
    	assertNotSame("N�o � o mesmo objeto tri�ngulo", t1, t2);
    	
    	assertFalse("N�o s�o iguais", t1.equals(t2));

	}
}
