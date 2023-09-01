package Exercicio5;

import java.util.Scanner;

public class Sucessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor númerico no teclado: ");
		int valor1=sc.nextInt();		

		int sucessor=valor1+1;
		System.out.println("O antecessor do numero escolhido é igual a: "+sucessor);
	
		sc.close();

	}

}
