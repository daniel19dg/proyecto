package solucion_5;
import java.util.Scanner;
public class solucion_5 {
	
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);

		String palabra, alreves = "";
		System.out.print("escribe una palabra: ");

		palabra = lector.nextLine();

		for (int x = palabra.length() - 1; x >= 0; x--)
			alreves += palabra.charAt(x);

		if (palabra.equals(alreves))
			System.out.print("\n la palabra es un palindromo");
		else
			System.out.print("\n la palabra no es palindromo ");
		
	

 }
}
