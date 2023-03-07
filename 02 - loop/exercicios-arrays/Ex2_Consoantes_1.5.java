/**
* Objetivo: fazer um programa que leia um vetor de 6 caracteres,
* e diga quantas consoantes foram lidas.
* e imprima as consoantes.
* 
* Validacao de entrada de dados, ignorando entradas invalidas
*
* @author Marcelo Soares
* @version 1.5
* @since 2023-03-02
*/
import java.util.Scanner;

public class Ex2_Consoantes{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		int quantidadesConsoantes = 0;
		
		int count = 0;		
		do{
			System.out.println("Letra: ");
			String letra = scan.next();
			
			if (letra.length() == 1 && Character.isLetter(letra.charAt(0))) {
				if (!(letra.equalsIgnoreCase("a") ||
					letra.equalsIgnoreCase("e") ||
					letra.equalsIgnoreCase("i") ||
					letra.equalsIgnoreCase("o") ||
					letra.equalsIgnoreCase("u"))){
						consoantes[count] = letra;
						quantidadesConsoantes++;
				}
				count++;
			} else {
				System.out.println("Entrada invalida, tente novamente.");
			}
		}while(count < consoantes.length);
		
	    System.out.println("quantidade de consoantes: " + quantidadesConsoantes);	
	    System.out.println("Consoantes: ");
		for (String consoante : consoantes){
			if (consoante != null)
				System.out.print(consoante + " ");
		}
	    scan.close();
	}
}