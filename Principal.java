package Rela_entre_Classes;

public class Principal {

	public static void main(String[] args) {
		

		Universidade universidade = new Universidade("USP");
		
		Estudante estudante = new Estudante("Rubinho", universidade);
		
		System.out.println("Estudante: " + estudante.getNome() + "\nUniversidade: " + universidade.getNome());
	}

}
