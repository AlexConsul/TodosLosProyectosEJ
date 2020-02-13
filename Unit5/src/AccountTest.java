

public class AccountTest {

	public static void main(String[] args) {
		// Account a=new Account(); 
		//No podemos crear una instancia de Account porque es abstracta
		
		SavingAccount sa=new SavingAccount("Pepe", "ES33-9876-7654-76767676-5443", 6700.0, 0.04 ,20 );
		System.out.println(sa.getFinalBalance());

	}

}
