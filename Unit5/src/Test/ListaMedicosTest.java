package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Hospital.ListaMedicos;
import Hospital.Medico;

class ListaMedicosTest {
	ListaMedicos lm = new ListaMedicos();
	
	@Test
	void testListaMedicos() {
		assertNotEquals(null, lm);
	}

	@Test
	void testAddMedico() {
		lm.addMedico(new Medico("1", "carlos", "saenz", "ordenadores"));
		assertTrue(lm.existeMedico("1"));
	}

	@Test
	void testBorrarPorDNI() {
		//clase equivalencia valida
		lm.addMedico(new Medico("1", "carlos", "saenz", "ordenadores"));
		assertTrue(lm.existeMedico("1"));
		lm.borrarPorDNI("1");
		assertFalse(lm.existeMedico("1"));
		
		//clase equivalencia invalida
		lm.borrarPorDNI("17");
		assertFalse(lm.existeMedico("17"));
	}

	@Test
	void testExisteMedico() {
		//clase equivalencia valida
		lm.addMedico(new Medico("1", "carlos", "saenz", "ordenadores"));
		assertTrue(lm.existeMedico("1"));
		
		//clase de equivalencia invalida
		assertFalse(lm.existeMedico("288"));
	}

}
