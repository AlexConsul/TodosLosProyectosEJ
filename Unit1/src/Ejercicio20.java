import java.util.Random;

public class Ejercicio20 {
public static void main (String[]args) {	
Random Aleatorio = new Random();
int N = Aleatorio.nextInt(8);
System.out.println ("El primer numero alearorio es :"+N);
Random Aleatorio1 = new Random();
int N1 = Aleatorio1.nextInt(8);
System.out.println ("El segundo numero alearorio es :"+N1);
Object suma = N+N1;
System.out.println("El total de los numeros aleatorios es :"+suma);	
}
}
