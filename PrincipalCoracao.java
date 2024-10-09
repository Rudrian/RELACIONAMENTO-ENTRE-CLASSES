package Rela_entre_Classes;

public class PrincipalCoracao {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Rubinho", 100);
		
		System.out.println(pessoa.getNome() + " Tem a média de " + pessoa.getCoracao() + " batimentos");
	}

}
