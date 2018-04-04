
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testa condicionais");

		int idade = 16;
		int quantidadePessoas = 5;

		if (idade >= 18) {
			System.out.println("Você tem 18 anos ou mais");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar, pois está acompanhado");
			} else {
				System.out.println("Infelizmente você não pode entrar");
			}
		}
	}
}
