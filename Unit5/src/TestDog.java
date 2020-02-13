

public class TestDog {
	 public static void main(String[] args) 
	 {
		 Animal a=new Animal();
		 Animal d=new Dog();
		 
		 Dog p=new Dog();
		 a.move();
		 d.move();
		 //d.ladrar() //problema de compilación porque animal no tiene la clase ladrar
		 p.ladrar();
	 }
}
