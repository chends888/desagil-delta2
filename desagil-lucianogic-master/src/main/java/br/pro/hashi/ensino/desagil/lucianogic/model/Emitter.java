package br.pro.hashi.ensino.desagil.lucianogic.model;

public interface Emitter {
	public default boolean read() {
		return read(0);
	}

	public boolean read(int index);
}
