
public class TestaEscopo {

	public static void main(String[] args) {
		
		int idade = 20;
		int quantidadePessoa = 3;
		boolean acompanhado;
		
		if (quantidadePessoa >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelizmente você não pode entrar");
		}
	}

}
