
public class TestBook {
	public static void main(String[] args) {
		Author a1=new Author("Jane Austen","no email",'F');
		Book b1=new Book("Orgullo y Prejuicio", a1, 16.5);
		b1.setQtyInStock(2);
		System.out.println(b1.toString());
		
		Author a2=new Author("Bebi Fernández","srtabebi@gmail.com",'F');
		Book b2=new Book("Amor y Asco", a2, 0, 5);
		b2.setPrice(14);
		System.out.println(b2.toString());
	}
}
