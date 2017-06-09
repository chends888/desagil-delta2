package br.pro.hashi.ensino.desagil.lucianogic.model;

public class MockEmitter implements Emitter {
	private boolean signal;

	public MockEmitter(boolean signal) {
		this.signal = signal;
	}

	@Override
	public boolean read(int index) {
		if(index != 0) {
			throw new IndexOutOfBoundsException();
		}
		return signal;
	}
}
