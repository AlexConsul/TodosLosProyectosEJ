
public class WareHouse {
	//Atributos
	private double patatas;
	private double salchichas;
	
	public WareHouse() {
		patatas = 0.0;
		salchichas = 0.0;
		
			}

	public WareHouse(double patatas, double salchichas) {
		this.patatas = patatas;
		this.salchichas = salchichas;
			
		
		}
	//Constructores
	
		public double getpatatas() {
			return patatas;
		}

		public void setpatatas(double patatas) {
			this.patatas = patatas;
		}

		public double getsalchichas() {
			return salchichas;
		}

		public void setsalchichas(double salchichas) {
			this.salchichas = salchichas;
		}

	
		public double getNumberOfMeals() {
			return (patatas+(salchichas/0.5))/3;
		
	//Metodos	
			
		}	
		public void addpatatas(int patatas) {
			System.out.println(patatas);
		}
		public void addsalchicas(int salchichas) {
			System.out.println(salchichas);
		}
		public static void main(String[]args) {
		
	//Printeo	
			
			WareHouse c=new WareHouse(15.8,13.6);
				
			System.out.println("Los kgs de patatas son " + c.getpatatas());		
			System.out.println("Los kgs de salchichas son " + c.getsalchichas());
			System.out.println("Se pueden preparar estos kgs de comida " + c.getNumberOfMeals());	
			
		}
	}

