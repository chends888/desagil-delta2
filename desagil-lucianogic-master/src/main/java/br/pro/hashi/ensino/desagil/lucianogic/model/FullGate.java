package br.pro.hashi.ensino.desagil.lucianogic.model;

public class FullGate extends Gate {
	
	private HalfGate halfleft;
	private HalfGate halfmid;
	private HalfGate halfright;
	private Ponte ponteleft;
	private Ponte ponteright;


	
	


	public FullGate() {
		
		super (3, 2);
		
		name = "FULL";
		
		halfleft = new HalfGate();
		halfmid = new HalfGate();
		halfright = new HalfGate();
		ponteleft = new Ponte(halfleft);
		ponteright = new Ponte(halfmid);

		
		halfright.connect(ponteright, 0);
		halfright.connect(ponteleft, 1);
		
		
		
		
	}

	@Override
	protected boolean doRead(int index) {
		if (index == 0) {
			return halfmid.read(0);
		}
		else {
			return halfright.read(1);
		}
	}

	@Override
	protected void doConnect(Emitter emitter, int index) {
		if (index == 0) {
			halfmid.connect(emitter, 0);
		}
		
		if (index == 1) {
			halfleft.connect(emitter, 0);
		}
		
		else {
			halfleft.connect(emitter, 1);
		}
		
	}

}
