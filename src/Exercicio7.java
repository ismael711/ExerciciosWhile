import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// No parque Valter Dino World, os clientes podem ter a chance de passar uma noite no castelo da princesa Javarella. Para isso, devem acertar quantos feij�es est�o em um jarro (1238). Fa�a um programa que solicite a digita��o da quantidade de feij�es at� que um cliente acerte
				int quantidadeFeijao = 0;
				
				Scanner leitor = new Scanner(System.in);
				
				System.out.println("Seja bem vindo ao Parque Valter Dino World");
				System.out.println("Por favor, informe a quantidade de feij�es: ");
				quantidadeFeijao = leitor.nextInt();
				
				while(quantidadeFeijao != 1238) {
					System.out.println("Voc� errou, tente novamente!");
					System.out.println("Por favor, informe a quantidade de feij�es: ");
					quantidadeFeijao = leitor.nextInt();
				}
				
				System.out.println("Voc� acertou, parab�ns!"); 
				System.out.println("Por favor, dirija-se � portaria do Castelo da Princesa Javarella!");
				
				leitor.close();
	}

}
