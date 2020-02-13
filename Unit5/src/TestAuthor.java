
public class TestAuthor {
	public static void main(String[] args) {
		Author a1=new Author("Jane Austen","no email",'F');
		System.out.println(a1.toString());
		
		Author a2=new Author("Shakespeare","no email",'M');
		a2.setEmail("shakespeare@gmail.com");
		System.out.println(a2.toString());
	}
}
