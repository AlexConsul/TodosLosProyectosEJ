public class Empleado {
	//Atributos
	private String nombre;
	private double salario;

	//Constructores
	public Empleado() {
		this.nombre="";
		this.salario=0;		
	}
	
	public Empleado (String nombre, double salario) {
		this.nombre=nombre;
		this.salario=salario;		
	}
	
	//Getters and Setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//Métodos
	public String toString() {
		return "El empleado tiene nombre "+nombre+" y salario "+salario;
	}
	
	public boolean impuestoExtra() {
		if(salario>3000) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main (String[] args) {
		Empleado e1=new Empleado();
		System.out.println(e1.toString());
		e1.setNombre("Pepa");
		e1.setSalario(2000);
		System.out.println(e1.toString());
		System.out.println(e1.impuestoExtra());
		
		Empleado e2=new Empleado ("Pepe", 4000);
		System.out.println(e2.toString());
		System.out.println(e2.impuestoExtra());
		e2.setSalario(4500);
		System.out.println(e2.toString());
	}
}
