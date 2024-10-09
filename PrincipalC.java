package Rela_entre_Classes;

public class PrincipalC {

	public static void main(String[] args) {
		
		Motor motor = new Motor("V12");
		Carro carro = new Carro("Lamborghini Aventador SVJ", motor);
		
		System.out.println("O carro é: " + carro.getModelo() + "\nMotor: " + motor.getTipo());
	}
}
