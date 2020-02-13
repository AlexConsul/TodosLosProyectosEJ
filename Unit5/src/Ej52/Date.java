package Ej52;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Date {
/*Escribe un programa implementando un método llamado 
  howOld(GregorianCalendar birthday), donde dada una 
  fecha de cumpleaños, calcule la edad de la persona.*/
	public static void main(String[] args) {;
		Date d=new Date();
		int day=25;
		int month=9;
		int year=2000;
		
		GregorianCalendar birthday = null;
		System.out.println("La persona que ha nacido el "+birthday+" tiene "+d.howOld(birthday)+" años.");
	}
	
	public int howOld(GregorianCalendar birthday) {
		Calendar fecha = new GregorianCalendar();
		int dia=fecha.get(Calendar.DAY_OF_MONTH);
		int mes=fecha.get(Calendar.MONTH);
		int año=fecha.get(Calendar.YEAR);
		
	
		int edad=(año-year)+(mes-month)+(dia-day);
		return edad;
	}
}
