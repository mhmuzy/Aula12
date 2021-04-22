package Hitss.Treinamento.Repositorio;

public class MamiferoRepositorio extends AnimalRepositorio {

	@Override
	public void locomover() {
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		System.out.println("Mamando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Mamífero");
	}

}
