package principal;

public class Main {

	public static void main(String[] args) {

		/*
		 * Escribe el c�digo, donde corresponda, de la PARTE II del enunciado de la
		 * pr�ctica de laboratorio L-J1. NO BORRES LO QUE EST� ESCRITO EN ESTE PROYECTO.
		 * SOLO A�ADE LO QUE SE TE PIDE.
		 */

		// EJERCICIO 3 (puedes abrir el hueco que necesites)

		String nombre = "Yovanny";
		int edad = 18;
		int dni = 42261353;
		double altura = 1.80;
		String repites = "No";
		boolean x = true;
		boolean y = false;
		boolean z = true;

		// fin EJERCICIO 3

		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("DNI: " + dni);
		System.out.println("Altura: " + altura);
		System.out.println("Repetidor/a: " + repites);

		// EJERCICIO 5 (puedes abrir el hueco que necesites)

		boolean expresionLogica_1 = x && y || z;
		boolean expresionLogica_2 = (x && y) || (!x && !z);
		boolean expresionLogica_3 = x && y;
		boolean expresionLogica_4 = x && y || y;

		// fin EJERCICIO 5

		System.out.println("Expresi�n l�gica 1: " + expresionLogica_1);
		System.out.println("Expresi�n l�gica 2: " + expresionLogica_2);
		System.out.println("Expresi�n l�gica 3: " + expresionLogica_3);
		System.out.println("Expresi�n l�gica 4: " + expresionLogica_4);

		// EJERCICIO 6 (puedes abrir el hueco que necesites)

		int a = 8;
		int b = -5;
		int c = 3;
		double d = 3.2;

		int expresionAritmetica_1 = 2 * b + 3 * (a - c);
		int expresionAritmetica_2 = a / b;
		float expresionAritmetica_3 = a / b;
		float expresionAritmetica_4 = a / (float) b;
		double expresionAritmetica_5 = (a + b) / d;
		int expresionAritmetica_6 = (a * c) % b;

		// fin EJERCICIO 6

		System.out.println("Expresi�n aritm�tica 1: " + expresionAritmetica_1);
		System.out.println("Expresi�n aritm�tica 2: " + expresionAritmetica_2);
		System.out.println("Expresi�n aritm�tica 3: " + expresionAritmetica_3);
		System.out.println("Expresi�n aritm�tica 4: " + expresionAritmetica_4);
		System.out.println("Expresi�n aritm�tica 5: " + expresionAritmetica_5);
		System.out.println("Expresi�n aritm�tica 6: " + expresionAritmetica_6);

		// EJERCICIO 7 (puedes abrir el hueco que necesites)

		for (int i = 0; i < 10; i++) {
			System.out.println("Hola Mundo");
		}

		// fin EJERCICIO 7

		// EJERCICIO 8 (puedes abrir el hueco que necesites)

		int k = 0;
		while (k < 5) {
		    System.out.print("Hola Mundo ");
		    k++;
		}
		System.out.println();
		
		// fin EJERCICIO 8

		// EJERCICIO 9 (puedes abrir el hueco que necesites)

		for (int l = 1; l <= 10; l++) {
			System.out.println(l);
		}

		// fin EJERCICIO 9

		// EJERCICIO 10 (puedes abrir el hueco que necesites)

		for (int o = 1; o <= 10; o++) {
			if (o % 2 == 0) {
				System.out.println(o);
			}
		}

		// fin EJERCICIO 10

		// EJERCICIO 11 (puedes abrir el hueco que necesites)

		for (int j = 1; j <= 10; j++) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
		}

		// fin EJERCICIO 11

	}

}
