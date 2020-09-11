import java.util.Scanner;

public class Main_Class {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Por favor, insira a nota da prova: ");
		float nota_prova = input.nextFloat() * 3;

		System.out.println("Por favor, insira a nota do projeto: ");
		float nota_projeto = input.nextFloat() * 3;

		System.out.println("Por favor, insira a nota da lista de exercicios: ");
		float nota_exercicio = input.nextFloat() * 2;

		System.out.println("Por favor, insira a nota do MOOC: ");
		float nota_mooc = input.nextFloat() * 3;

		input.close();
		
		float media_final = (nota_prova + nota_projeto + nota_exercicio + nota_mooc) / 10;

		if (media_final >= 8.0) {
			System.out.printf("Aluno Aprovado com nota: %.1f!!", (media_final));
		} else {
			System.out.printf("Aluno Reprovado com nota: %.1f!!\n", (media_final));

			media_final = (10 - media_final);
			System.out.printf("Nota minima para a prova final: %.1f!!", (media_final));
		}
	}
}