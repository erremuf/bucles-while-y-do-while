package com.aepi;

import java.util.Scanner;

public class EjercicioDos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Escribe un número: ");
		num = sc.nextInt();
		
		while (num != 0) {
			if (num < 0) {
				System.out.println("El número es negativo");
			}else {
				System.out.println("El número es positivo");
			}
			System.out.println("\nEscribe otro número: ");
			num = sc.nextInt();
		}
		

	}

}
