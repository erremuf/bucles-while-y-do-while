package com.aepi;

import java.nio.channels.spi.AbstractSelector;
import java.util.Scanner;

public class EjercicioUno {

	public static void main(String[] args) {
		
		int num, unidades, decenas;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.println("\nPEDIR UN NÚMERO DEL 0 AL 99 Y MOSTRARLO ESCRITO\n");
		
		System.out.println("Escribe un número: ");
		num = lector.nextInt();
		unidades = num % 10;
		decenas = (num / 10);
		
		switch(decenas) {
			case 0: System.out.print("");
			break;
			case 1: System.out.print("Diez ");
			break;
			case 2: System.err.print("Veinte ");
			break;
			case 3: System.out.print("Treinta ");
			break;
			case 4: System.out.print("Cuarenta ");
			break;
			case 5: System.out.print("Cincuenta ");
			break;
			case 6: System.out.print("Sesenta ");
			break;
			case 7: System.out.print("Setenta ");
			break;
			case 8: System.out.print("Ochenta ");
			break;
			case 9: System.out.print("Noventa ");
			break;
		}
		
		System.out.println("y");
		
		switch(unidades) {
			case 0: System.out.print("");
			break;
			case 1: System.out.print(" uno");
			break;
			case 2: System.err.print(" dos");
			break;
			case 3: System.out.print(" tres");
			break;
			case 4: System.out.print(" cuatro");
			break;
			case 5: System.out.print(" cinco");
			break;
			case 6: System.out.print(" seis");
			break;
			case 7: System.out.print(" siete");
			break;
			case 8: System.out.print(" ocho");
			break;
			case 9: System.out.print(" nueve");
			break;
		}
		
		
	}
		
		
}
