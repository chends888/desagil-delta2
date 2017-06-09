package br.pro.hashi.ensino.desagil.lucianogic.model;

public class Ponte implements Emitter {
	
	//Recebe uma gate
	private Gate gate;


	protected Ponte(Gate gate) {
		this.gate = gate;
	}


	//Retorna o sinal da saída 1
	@Override
	public boolean read(int index) {
		return gate.read(1);
	}

}
