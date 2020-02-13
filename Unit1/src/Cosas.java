
public class Cosas {
	private int profesores;
	private int alumnos;
	private int asignaturas;
	private int examenes;
	private String getAsignaturas;

	public Cosas() {

		profesores = 0;
		alumnos = 0;
		asignaturas = 0;
		examenes = 0;
	}

	public Cosas(int profesores, int alumnos, int asignaturas, int examenes) {
		this.profesores = profesores;
		this.alumnos = alumnos;
		this.asignaturas = asignaturas;
		this.examenes = examenes;
	}

	public int getProfesores() {
		return profesores;
	}

	public void setProfesores(int profesores) {
		this.profesores = profesores;
	}

	public int getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(int alumnos) {
		this.alumnos = alumnos;
	}

	public int getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(int asignaturas) {
		this.asignaturas = asignaturas;
	}

	public int getExamenes() {
		return examenes;
	}

	public void setExamenes(int examenes) {
		this.examenes = examenes;
	}
	public static void main(String[]args) {
		Cosas c=new Cosas(8, 79, 8, 65);
		System .out.println("Los profesores dan clases a " + c.getAlumnos());
		System.out.println("Los alumnos son " + c.getAlumnos());
		System.out.println("Estas son las asignaturas que hay: " + c.getAsignaturas());
		System.out.println("Todos los exámenes que vamos a tener: " + c.getExamenes());
		
	}
}
