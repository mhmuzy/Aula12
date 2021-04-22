package Hitss.Treinamento.Repositorio;

public class ReptilRepositorio extends AnimalRepositorio {

	@Override
	public void locomover() {
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Reptil");
	}

}
