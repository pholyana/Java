package Acabou2;

public class TriAtleta implements Corredor2, Nadador2, ciclista2{

	@Override
	public void aquecer() {
		System.out.println(nome + " começou a aquecer");
		
	}

	@Override
	public void pedalar() {
		System.out.println(nome + " começou a pedalar");
		
	}

	@Override
	public void pararDePedalar() {
	System.out.println(nome + "parou de pedalar");
		
	}

	@Override
	public void nadar() {
		System.out.println(nome + "começou a nadar");
		
	}

	@Override
	public void pararDeNadar() {
		System.out.println(nome + " parou de nadar");
		
	}

	@Override
	public void correr() {
		System.out.println(nome + "começou a correr");		
	}

	@Override
	public void pararDeCorrer() {
		System.out.println(nome + "parou e correr");
		
	}		
		}

