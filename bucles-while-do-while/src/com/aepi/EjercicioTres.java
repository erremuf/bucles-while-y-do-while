package com.aepi;

import java.util.Scanner;

public class EjercicioTres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, numTotal = 0;
		
		System.out.print("Escribe un nº: ");
		num = sc.nextInt();
		
		do {
			System.out.print("nº positivo, escribe otro: ");
			num = sc.nextInt();	
			numTotal+=1; //  Como el primer scaner lo he puesto fuera del bucle, sumo uno. Poidría haberle puesto valor 1 también.
		}
		while(num >= 0);
		
		System.out.println("Has introducido " + numTotal + " números.");

	}

}
