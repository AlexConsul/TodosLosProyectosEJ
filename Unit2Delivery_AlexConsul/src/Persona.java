public class Persona {
	// Estado Atributos
	private String name;
	private int age;
	private String dni;
	private char gender;
	private double weight;
	private double height;
	private int credit;
	// Comportamiento
	// Constructores

	/*
	 * Un constructor por defecto, dando valores por defecto a los atributos (género
	 * M por defecto).
	 * 
	 */

	public Persona() {
		name = "";
		age = 0;
		dni = "";
		gender = 'M';
		weight = 0.0;
		height = 0.0;
		credit = 0;
	}

	/*
	 * Otro pasando por parámetro los atributos name,age and gender y dando al resto
	 * de parámetros valores por defecto
	 */
	public Persona(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		dni = "";
		this.gender = gender;
		weight = 0.0;
		height = 0.0;
		credit = 0;
	}

	/* Todos los atributos pasan como parámetros. */

	public Persona(String name, int age, String dni, char gender, double weight, double height, int credit) {
		this.name = name;
		this.age = age;
		this.dni = dni;
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.credit = credit;
	}

	// Getter and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public int getCredits() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	// Métodos

	/* isAdult:devuelve si la persona es adulto o no. */
	public boolean isAdult() {
		if (age > 18) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * idealWeight:devuelve si la persona tiene un peso idal(IMC>=20 and IMC<=25))
	 */
	public boolean idealWeight() {
		double imc = weight / (height*height);
		
		if ((imc >= 20) && (imc <= 25)) {
			return true;
		} else {
			return false;
		}
	}

	/* toString:imprime toda la información de la persona */

	public String toString() {
		return "La persona " + name + " tiene dni " + dni + " tiene " + age + " años" + " y genero " + gender + " peso "
				+ weight + " altura " + height + " tiene " + credit;
	}

}
