
public class TestMusicOrganizer {
	public static void main(String[] args) {
		//Ejercicio 1
		System.out.println("Ejercicio 1");
		MusicOrganizer mo=new MusicOrganizer();
		
		mo.addFile("Mi canción 1");
		mo.addFile("Mi canción 2");
		mo.addFile("Mi canción 3");
		
		int numFiles=mo.getNumberOfFiles();
		System.out.println(numFiles);
		
		mo.listFile(0);
		mo.listFile(1);
		mo.listFile(2);
		System.out.println(" ");
		
		//Ejercicio 2
		System.out.println("Ejercicio 2");
		MusicOrganizer mo2=new MusicOrganizer();
		mo2.removeFile(0); 
		/*No devuelve error porque nuestro código de la clase lo comprueba*/
		System.out.println(" ");
		
		//Ejercicio 3
		System.out.println("Ejercicio 3");
		MusicOrganizer mo3=new MusicOrganizer();
		
		mo3.addFile("Mi canción 1");
		mo3.addFile("Mi canción 2");
		
		mo3.removeFile(0);
		mo3.listFile(0);
		System.out.println(" ");
		
		//Ejercicio 4
		System.out.println("Ejercicio 4");
		MusicOrganizer mo4=new MusicOrganizer();
		
		mo4.addFile("Mi canción 1");
		mo4.addFile("Mi canción 2");
		mo4.addFile("Mi canción 3");
		
		mo4.checkIndex(4);
		System.out.println(" ");
		
		//Ejercicio 5
		System.out.println("Ejercicio 5");
		MusicOrganizer mo5=new MusicOrganizer();
		
		mo5.addFile("Mi canción 1");
		mo5.addFile("Mi canción 2");
		mo5.addFile("Mi canción 3");
		
		System.out.println(mo5.validIndex(4));
		System.out.println(" ");
		
		//Ejercicio 6
		System.out.println("Ejercicio 6");
		mo5.listFile(4);
		mo5.removeFile(4);
		
		System.out.println(" ");
		
		//Ejercicio 7
		System.out.println("Ejercicio 7");
		mo5.listAllFiles();
		
		System.out.println(" ");
		
		//Ejercicio 8
		System.out.println("Ejercicio 8");
		mo5.listMatching("1");
		mo5.listMatching("Mi");
		
		System.out.println(" ");
		
	}
}
