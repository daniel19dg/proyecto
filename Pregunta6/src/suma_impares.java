import java.util.Scanner;

public class suma_impares {
// dado n numero determinar suma de digitos impares
	
	public static void main(String[] args) {
		
		int entero = 1, residuo = 1, temp=0, suma =0;
		Scanner n1 = new Scanner(System.in);
		System.out.println("ingrese un numero natural");
		int natural = n1.nextInt();
		
		while(entero>0)
		{
			residuo =natural % 10;
			entero = natural / 10;
			natural = entero;
			suma = residuo + temp;
			temp= suma;
		}
		System.out.println("la suma de las digitos impares es.  "+ suma);
			
			
			
		}

	}


