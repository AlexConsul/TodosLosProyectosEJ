package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Hospital.Medico;

class MedicoTest {
	
	Medico m = new Medico("1", "carlos", "saenz", "ordenadores");

	@Test
	void testToString() {
		String expected = "Nombre: carlos Apellido: saenz DNI: 1 Especialidad: ordenadores"; 
		assertEquals(expected, m.toString());
	}

	@Test
	void testGetDni() {
		assertEquals(m.getDni(), "1");
	}

	@Test
	void testSetDni() {
		m.setDni("2");
		assertEquals(m.getDni(), "2");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido() {
		fail("Not yet implemented");
	}

}
