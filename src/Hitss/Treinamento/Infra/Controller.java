package Hitss.Treinamento.Infra;

import java.util.Scanner;
import Hitss.Treinamneto.Classes.*;
import Hitss.Treinamento.Repositorio.*;

public class Controller {
	public void Play() {
		try {
			
		
		System.out.println("");
		System.out.println("--------------------------------------------------");
		System.out.println("(1) - Locomover a Ave");
		System.out.println("(2) - Locomover o Mamífero");
		System.out.println("(3) - Locomover o Peixe");
		System.out.println("(4) - Locomover o Réptil");
		System.out.println("(5) - Alimentar a Ave");
		System.out.println("(6) - Alimentar o Mamífero");
		System.out.println("(7) - Alimentar o Peixe");
		System.out.println("(8) - Alimentar o Réptil");
		System.out.println("(9) - Emitir som a Ave");
		System.out.println("(10) - Emitir som o Mamífero");
		System.out.println("(11) - Emitir som o Peixe");
		System.out.println("(12) - Emitir som o Réptil");
		System.out.println("(13) - Fazer Ninho a Ave");
		System.out.println("(14) - Soltar Bolha o Peixe");
		System.out.println("--------------------------------------------------");
		System.out.println("");
		System.out.println("Digite a opção desejada:");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		System.out.println("");
		
		switch (opcao) {
		case 1:
			try {
				
			
			Ave ave = new Ave();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 45.0f;
			peso[2] = 15.0f;
			peso[3] = 0.5f;
			peso[4] = 7.0f;
			
			int[] idade = new int[5];
			idade[1] = 10;
			idade[2] = 20;
			idade[3] = 75;
			idade[4] = 3;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corPena = new String[5];
			corPena[1] = "Marrom";
			corPena[2] = "Branca";
			corPena[3] = "Marron";
			corPena[4] = "Branca";
			
			System.out.println("");
			System.out.println("Digite o Código da Ave");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				ave.setPeso(peso[Codigo]);
				ave.setIdade(idade[Codigo]);
				ave.setMembros(membros[Codigo]);
				ave.setCorPena(corPena[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação da Ave");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + ave.getPeso());
				System.out.println("Idade: " + ave.getIdade());
				System.out.println("Membros: " + ave.getMembros());
				System.out.println("Cor da Pena: " + ave.getCorPena());
				System.out.println("------------------------------------------");
				System.out.println("");
				AveRepositorio rep = new AveRepositorio();
				rep.locomover();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 2:
			try {
				
			
			Mamifero mamifero = new Mamifero();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 180.0f;
			peso[2] = 120.0f;
			peso[3] = 175.0f;
			peso[4] = 2.0f;
			
			int[] idade = new int[5];
			idade[1] = 15;
			idade[2] = 18;
			idade[3] = 16;
			idade[4] = 6;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corPelo = new String[5];
			corPelo[1] = "Preto";
			corPelo[2] = "Branco";
			corPelo[3] = "Malhada";
			corPelo[4] = "Preto";
			
			System.out.println("");
			System.out.println("Digite o Código do Mamífero");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				mamifero.setPeso(peso[Codigo]);
				mamifero.setIdade(idade[Codigo]);
				mamifero.setMembros(membros[Codigo]);
				mamifero.setCorPelo(corPelo[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação do Mamífero");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + mamifero.getPeso());
				System.out.println("Idade: " + mamifero.getIdade());
				System.out.println("Membros: " + mamifero.getMembros());
				System.out.println("Cor do Pelo: " + mamifero.getCorPelo());
				System.out.println("------------------------------------------");
				System.out.println("");
				MamiferoRepositorio rep = new MamiferoRepositorio();
				rep.locomover();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 3:
			try {
				
			
			Peixe peixe = new Peixe();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 180.0f;
			peso[2] = 120.0f;
			peso[3] = 175.0f;
			peso[4] = 2.0f;
			
			int[] idade = new int[5];
			idade[1] = 15;
			idade[2] = 18;
			idade[3] = 16;
			idade[4] = 6;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corEscama = new String[5];
			corEscama[1] = "Dourado";
			corEscama[2] = "Prateado";
			corEscama[3] = "Azul";
			corEscama[4] = "Vermelho";
			
			System.out.println("");
			System.out.println("Digite o Código do Peixe");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				peixe.setPeso(peso[Codigo]);
				peixe.setIdade(idade[Codigo]);
				peixe.setMembros(membros[Codigo]);
				peixe.setCorEscama(corEscama[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação do Peixe");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + peixe.getPeso());
				System.out.println("Idade: " + peixe.getIdade());
				System.out.println("Membros: " + peixe.getMembros());
				System.out.println("Cor da Escama: " + peixe.getCorEscama());
				System.out.println("------------------------------------------");
				System.out.println("");
				PeixeRepositorio rep = new PeixeRepositorio();
				rep.locomover();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 4:
			try {
				
			
			Reptil reptil = new Reptil();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 180.0f;
			peso[2] = 120.0f;
			peso[3] = 175.0f;
			peso[4] = 2.0f;
			
			int[] idade = new int[5];
			idade[1] = 15;
			idade[2] = 18;
			idade[3] = 16;
			idade[4] = 6;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corEscama = new String[5];
			corEscama[1] = "Prateado";
			corEscama[2] = "Verde";
			corEscama[3] = "Verde";
			corEscama[4] = "Preto";
			
			System.out.println("");
			System.out.println("Digite o Código do Réptil");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				reptil.setPeso(peso[Codigo]);
				reptil.setIdade(idade[Codigo]);
				reptil.setMembros(membros[Codigo]);
				reptil.setCorEscama(corEscama[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação do Réptil");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + reptil.getPeso());
				System.out.println("Idade: " + reptil.getIdade());
				System.out.println("Membros: " + reptil.getMembros());
				System.out.println("Cor da Escama: " + reptil.getCorEscama());
				System.out.println("------------------------------------------");
				System.out.println("");
				ReptilRepositorio rep = new ReptilRepositorio();
				rep.locomover();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 5:
			try {
				
			
			Ave ave = new Ave();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 45.0f;
			peso[2] = 15.0f;
			peso[3] = 0.5f;
			peso[4] = 7.0f;
			
			int[] idade = new int[5];
			idade[1] = 10;
			idade[2] = 20;
			idade[3] = 75;
			idade[4] = 3;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corPena = new String[5];
			corPena[1] = "Marrom";
			corPena[2] = "Branca";
			corPena[3] = "Marron";
			corPena[4] = "Branca";
			
			System.out.println("");
			System.out.println("Digite o Código da Ave");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				ave.setPeso(peso[Codigo]);
				ave.setIdade(idade[Codigo]);
				ave.setMembros(membros[Codigo]);
				ave.setCorPena(corPena[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação da Ave");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + ave.getPeso());
				System.out.println("Idade: " + ave.getIdade());
				System.out.println("Membros: " + ave.getMembros());
				System.out.println("Cor da Pena: " + ave.getCorPena());
				System.out.println("------------------------------------------");
				System.out.println("");
				AveRepositorio rep = new AveRepositorio();
				rep.alimentar();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 6:
			try {
				
			
			Mamifero mamifero = new Mamifero();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 180.0f;
			peso[2] = 120.0f;
			peso[3] = 175.0f;
			peso[4] = 2.0f;
			
			int[] idade = new int[5];
			idade[1] = 15;
			idade[2] = 18;
			idade[3] = 16;
			idade[4] = 6;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corPelo = new String[5];
			corPelo[1] = "Preto";
			corPelo[2] = "Branco";
			corPelo[3] = "Malhada";
			corPelo[4] = "Preto";
			
			System.out.println("");
			System.out.println("Digite o Código do Mamífero");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				mamifero.setPeso(peso[Codigo]);
				mamifero.setIdade(idade[Codigo]);
				mamifero.setMembros(membros[Codigo]);
				mamifero.setCorPelo(corPelo[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação do Mamífero");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + mamifero.getPeso());
				System.out.println("Idade: " + mamifero.getIdade());
				System.out.println("Membros: " + mamifero.getMembros());
				System.out.println("Cor do Pelo: " + mamifero.getCorPelo());
				System.out.println("------------------------------------------");
				System.out.println("");
				MamiferoRepositorio rep = new MamiferoRepositorio();
				rep.alimentar();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 7:
			try {
				
			
			Peixe peixe = new Peixe();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 180.0f;
			peso[2] = 120.0f;
			peso[3] = 175.0f;
			peso[4] = 2.0f;
			
			int[] idade = new int[5];
			idade[1] = 15;
			idade[2] = 18;
			idade[3] = 16;
			idade[4] = 6;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corEscama = new String[5];
			corEscama[1] = "Dourado";
			corEscama[2] = "Prateado";
			corEscama[3] = "Azul";
			corEscama[4] = "Vermelho";
			
			System.out.println("");
			System.out.println("Digite o Código do Peixe");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				peixe.setPeso(peso[Codigo]);
				peixe.setIdade(idade[Codigo]);
				peixe.setMembros(membros[Codigo]);
				peixe.setCorEscama(corEscama[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação do Peixe");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + peixe.getPeso());
				System.out.println("Idade: " + peixe.getIdade());
				System.out.println("Membros: " + peixe.getMembros());
				System.out.println("Cor da Escama: " + peixe.getCorEscama());
				System.out.println("------------------------------------------");
				System.out.println("");
				PeixeRepositorio rep = new PeixeRepositorio();
				rep.alimentar();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 8:
			try {
				
			
			Reptil reptil = new Reptil();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 180.0f;
			peso[2] = 120.0f;
			peso[3] = 175.0f;
			peso[4] = 2.0f;
			
			int[] idade = new int[5];
			idade[1] = 15;
			idade[2] = 18;
			idade[3] = 16;
			idade[4] = 6;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corEscama = new String[5];
			corEscama[1] = "Prateado";
			corEscama[2] = "Verde";
			corEscama[3] = "Verde";
			corEscama[4] = "Preto";
			
			System.out.println("");
			System.out.println("Digite o Código do Réptil");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				reptil.setPeso(peso[Codigo]);
				reptil.setIdade(idade[Codigo]);
				reptil.setMembros(membros[Codigo]);
				reptil.setCorEscama(corEscama[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação do Réptil");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + reptil.getPeso());
				System.out.println("Idade: " + reptil.getIdade());
				System.out.println("Membros: " + reptil.getMembros());
				System.out.println("Cor da Escama: " + reptil.getCorEscama());
				System.out.println("------------------------------------------");
				System.out.println("");
				ReptilRepositorio rep = new ReptilRepositorio();
				rep.alimentar();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 9:
			try {
				
			
			Ave ave = new Ave();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 45.0f;
			peso[2] = 15.0f;
			peso[3] = 0.5f;
			peso[4] = 7.0f;
			
			int[] idade = new int[5];
			idade[1] = 10;
			idade[2] = 20;
			idade[3] = 75;
			idade[4] = 3;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corPena = new String[5];
			corPena[1] = "Marrom";
			corPena[2] = "Branca";
			corPena[3] = "Marron";
			corPena[4] = "Branca";
			
			System.out.println("");
			System.out.println("Digite o Código da Ave");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				ave.setPeso(peso[Codigo]);
				ave.setIdade(idade[Codigo]);
				ave.setMembros(membros[Codigo]);
				ave.setCorPena(corPena[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação da Ave");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + ave.getPeso());
				System.out.println("Idade: " + ave.getIdade());
				System.out.println("Membros: " + ave.getMembros());
				System.out.println("Cor da Pena: " + ave.getCorPena());
				System.out.println("------------------------------------------");
				System.out.println("");
				AveRepositorio rep = new AveRepositorio();
				rep.emitirSom();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 10:
			try {
				
			
			Mamifero mamifero = new Mamifero();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 180.0f;
			peso[2] = 120.0f;
			peso[3] = 175.0f;
			peso[4] = 2.0f;
			
			int[] idade = new int[5];
			idade[1] = 15;
			idade[2] = 18;
			idade[3] = 16;
			idade[4] = 6;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corPelo = new String[5];
			corPelo[1] = "Preto";
			corPelo[2] = "Branco";
			corPelo[3] = "Malhada";
			corPelo[4] = "Preto";
			
			System.out.println("");
			System.out.println("Digite o Código do Mamífero");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				mamifero.setPeso(peso[Codigo]);
				mamifero.setIdade(idade[Codigo]);
				mamifero.setMembros(membros[Codigo]);
				mamifero.setCorPelo(corPelo[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação do Mamífero");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + mamifero.getPeso());
				System.out.println("Idade: " + mamifero.getIdade());
				System.out.println("Membros: " + mamifero.getMembros());
				System.out.println("Cor do Pelo: " + mamifero.getCorPelo());
				System.out.println("------------------------------------------");
				System.out.println("");
				MamiferoRepositorio rep = new MamiferoRepositorio();
				rep.emitirSom();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 11:
			try {
				
			
			Peixe peixe = new Peixe();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 180.0f;
			peso[2] = 120.0f;
			peso[3] = 175.0f;
			peso[4] = 2.0f;
			
			int[] idade = new int[5];
			idade[1] = 15;
			idade[2] = 18;
			idade[3] = 16;
			idade[4] = 6;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corEscama = new String[5];
			corEscama[1] = "Dourado";
			corEscama[2] = "Prateado";
			corEscama[3] = "Azul";
			corEscama[4] = "Vermelho";
			
			System.out.println("");
			System.out.println("Digite o Código do Peixe");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				peixe.setPeso(peso[Codigo]);
				peixe.setIdade(idade[Codigo]);
				peixe.setMembros(membros[Codigo]);
				peixe.setCorEscama(corEscama[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação do Peixe");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + peixe.getPeso());
				System.out.println("Idade: " + peixe.getIdade());
				System.out.println("Membros: " + peixe.getMembros());
				System.out.println("Cor da Escama: " + peixe.getCorEscama());
				System.out.println("------------------------------------------");
				System.out.println("");
				PeixeRepositorio rep = new PeixeRepositorio();
				rep.emitirSom();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 12:
			try {
				
			
			Reptil reptil = new Reptil();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 180.0f;
			peso[2] = 120.0f;
			peso[3] = 175.0f;
			peso[4] = 2.0f;
			
			int[] idade = new int[5];
			idade[1] = 15;
			idade[2] = 18;
			idade[3] = 16;
			idade[4] = 6;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corEscama = new String[5];
			corEscama[1] = "Prateado";
			corEscama[2] = "Verde";
			corEscama[3] = "Verde";
			corEscama[4] = "Preto";
			
			System.out.println("");
			System.out.println("Digite o Código do Réptil");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				reptil.setPeso(peso[Codigo]);
				reptil.setIdade(idade[Codigo]);
				reptil.setMembros(membros[Codigo]);
				reptil.setCorEscama(corEscama[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação do Réptil");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + reptil.getPeso());
				System.out.println("Idade: " + reptil.getIdade());
				System.out.println("Membros: " + reptil.getMembros());
				System.out.println("Cor da Escama: " + reptil.getCorEscama());
				System.out.println("------------------------------------------");
				System.out.println("");
				ReptilRepositorio rep = new ReptilRepositorio();
				rep.emitirSom();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 13:
			try {
				
			
			Ave ave = new Ave();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 45.0f;
			peso[2] = 15.0f;
			peso[3] = 0.5f;
			peso[4] = 7.0f;
			
			int[] idade = new int[5];
			idade[1] = 10;
			idade[2] = 20;
			idade[3] = 75;
			idade[4] = 3;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corPena = new String[5];
			corPena[1] = "Marrom";
			corPena[2] = "Branca";
			corPena[3] = "Marron";
			corPena[4] = "Branca";
			
			System.out.println("");
			System.out.println("Digite o Código da Ave");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				ave.setPeso(peso[Codigo]);
				ave.setIdade(idade[Codigo]);
				ave.setMembros(membros[Codigo]);
				ave.setCorPena(corPena[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação da Ave");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + ave.getPeso());
				System.out.println("Idade: " + ave.getIdade());
				System.out.println("Membros: " + ave.getMembros());
				System.out.println("Cor da Pena: " + ave.getCorPena());
				System.out.println("------------------------------------------");
				System.out.println("");
				AveRepositorio rep = new AveRepositorio();
				rep.fazerNinho();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		case 14:
			try {
				
			
			Peixe peixe = new Peixe();
			
			int[] codigo = new int[5];
			codigo[1] = 1;
			codigo[2] = 2;
			codigo[3] = 3;
			codigo[4] = 4;
			
			float[] peso = new float[5];
			peso[1] = 180.0f;
			peso[2] = 120.0f;
			peso[3] = 175.0f;
			peso[4] = 2.0f;
			
			int[] idade = new int[5];
			idade[1] = 15;
			idade[2] = 18;
			idade[3] = 16;
			idade[4] = 6;
			
			int[] membros = new int[5];
			membros[1] = 4;
			membros[2] = 4;
			membros[3] = 4;
			membros[4] = 4;
			
			String[] corEscama = new String[5];
			corEscama[1] = "Dourado";
			corEscama[2] = "Prateado";
			corEscama[3] = "Azul";
			corEscama[4] = "Vermelho";
			
			System.out.println("");
			System.out.println("Digite o Código do Peixe");
			System.out.println("");
			int Codigo = teclado.nextInt();
			
			if (Codigo == codigo[Codigo]) {
				
				peixe.setPeso(peso[Codigo]);
				peixe.setIdade(idade[Codigo]);
				peixe.setMembros(membros[Codigo]);
				peixe.setCorEscama(corEscama[Codigo]);
				System.out.println("");
				System.out.println("Idemtificação do Peixe");
				System.out.println("------------------------------------------");
				System.out.println("Peso: " + peixe.getPeso());
				System.out.println("Idade: " + peixe.getIdade());
				System.out.println("Membros: " + peixe.getMembros());
				System.out.println("Cor da Escama: " + peixe.getCorEscama());
				System.out.println("------------------------------------------");
				System.out.println("");
				PeixeRepositorio rep = new PeixeRepositorio();
				rep.soltarBolha();
				
			} else {
			System.out.println("");
			System.out.println("Código Inválido");
			}
			} catch (Exception e) {
				System.out.println("");
				System.out.println("Código Inválido");
			}
			break;
		default:
			System.out.println("");
			System.out.println("Opção Inválida");
			break;
		}
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Erro de Processamento: "  + e.getMessage());
		}
	}
}
